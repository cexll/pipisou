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

class ADD
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
            $name = $_POST['name'];
            $link = $_POST['link'];
            if ($_POST['password'] != null || $_POST['password'] != "") {
                $password = $_POST['password'];
            } else {
                $password = null;
            }
            $this->db->addlink($name, $link, $password);
            header("Location: ../index.html");
        } catch (Exception $e) {
            header("Location: ../index.html");
        }
    }
}

$add = new ADD();
$re = $add->run();
