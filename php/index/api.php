<?php
/**
 * 操作mysql数据库
 *
 * 1. 建立连接
 *
 * 2. 编写sql
 *
 * 3. 执行sql
 *
 * 4. 处理结果
 *
 * 5. 关闭
 */

require_once './DB.php';

class APP
{
    private $db;

    /**
     * APP constructor.
     */
    public function __construct()
    {
        $this->db = new DB();
        header('Access-Control-Allow-Origin:*'); // 允许所有来源
        header('Access-Control-Allow-Method:POST,GET'); // 允许访问的方式

    }

    /**
     * 入口方法
     * @date 2019/5/14 18:03
     */
    public function run() {
        try {
            $pageSize = $_GET['pagesize'];
            $pageIndex = $_GET['pageindex'];
            $name = $_GET['name'];
            
            if (strpos($name, '#')) {
                return array(
                    'count' => 0,
                    'total_page' => 0,
                    'data' => null,
                );
            }

            $data = $this->pagination(intval($pageSize), intval($pageIndex), $name);

            $this->db->insert($name);


            $count = intval($this->getCount($name));

            $totalPage = ceil($count / $pageSize);

            $info = array(
                'count' => $count,
                'total_page' => $totalPage,
                'data' => $data,
            );
            return $this->returnSuccessData($info);

        } catch (Exception $e) {
            return $this->returnData($e->getCode(), $e->getMessage());
        }
    }

    /**
     * 分页查询
     * @param $pagesize
     * @param $pageindex
     * @return array
     * @throws MYSQLException
     * @date 2019/5/14 18:00
     */
    public function pagination($pageSize, $pageIndex, $name) {
        $sql = 'SELECT * FROM `linkinfo` WHERE `link_name` LIKE ? LIMIT ? OFFSET ? ';

        $limit = $pageSize;
        $offset = $pageSize * ($pageIndex - 1);
        $val = "%".$name."%";
        $data = $this->db->query($sql, array(
            $val,$limit,$offset
        ));

        return $data;
    }

    /**
     * 获取数量
     * @return mixed
     * @throws MYSQLException
     * @date 2019/5/14 20:11
     */
    public function getCount($name) {
        $sql = 'SELECT count(id) as count FROM linkinfo WHERE link_name LIKE ?';

        $val = "%".$name."%";
        $data = $this->db->query($sql, $val);

        return $data[0]['count'];
    }

    /**
     * 返回正常接口数据
     * @param $data
     * @return false|string
     * @date 2019/5/14 17:54
     */
    public function returnSuccessData($data) {
        $content = array(
            'code' => 0,
            'message' => 'Success',
            'info' => $data,

        );
        return json_encode($content);
    }

    /**
     * 返回数据
     * @param $code
     * @param $message
     * @param array $data
     * @return array
     * @date 2019/5/14 17:55
     */
    public function returnData($code, $message, $data= array()) {
        $content = array(
            'code' => $code,
            'message' => $message,
            'info' => $data,

        );
        return json_encode($content);
    }


}

$app = new APP();
$re = $app->run();

echo $re;