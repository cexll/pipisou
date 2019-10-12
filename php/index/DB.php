<?php
class DB
{

    /**
     * dsn mysql连接
     * @var mixed
     */
    private $dsn;
    /**
     * mysql 连接用户名
     * @var mixed
     */
    private $user;
    /**
     * mysql 数据库密码
     * @var mixed
     */
    private $password;
    /**
     * mysql 数据库字符集
     * @var mixed
     */
    private $charset;

    /**
     * pdo 对象
     * @var PDO
     */
    private $pdoInstance;
    /**
     * sql对象
     * @var PDOStatement
     */
    private $pdoSmt;

    /**
     * mysql 初始化
     * DB constructor.
     * @param array $config
     */
    public function __construct()
    {
        $this->dsn = 'mysql:host=localhost;port=3306;dbname=linkinfo;';
        $this->user ='';
        $this->password = '';
        $this->charset = 'utf-8';

        $this->connect();
    }

    /**
     * 连接数据库
     * @date 2019/5/14 17:40
     */
    private function connect()
    {
        if(!$this->pdoInstance) {

            // 获取pdo对象
            $this->pdoInstance = new PDO($this->dsn, $this->user, $this->password);

            // 设置pdo对象错误处理方式
            $this->pdoInstance->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        };
    }

    /**
     * 通过query执行sql获取数据
     * @param $sql
     * @param array $paramers
     * @return array
     * @throws MYSQLException
     * @date 2019/5/14 17:48
     */
    public function query($sql, $parameters = array()) {
        if(!is_array($parameters)) {
            $parameters = array($parameters);
        }
        $this->pdoSmt = $this->pdoInstance->prepare($sql);


        $index = 1;
        foreach ($parameters as $i) {
            $this->pdoSmt->bindValue($index++, $i,PDO::PARAM_STR ? PDO::PARAM_INT : PDO::PARAM_INT);    
        }
       
        $execRe = $this->pdoSmt->execute();
        if (!$execRe) {
            throw new MYSQLException($this->pdoSmt->errorInfo(), $this->pdoSmt->errorCode());
        }

        $data = $this->pdoSmt->fetchAll(PDO::FETCH_ASSOC);
        return $data;
    }

    public function insert($val) {
        $sql = "INSERT INTO `querynums`(`name`) VALUES(?)";
        $this->pdoSmt = $this->pdoInstance->prepare($sql);
        $this->pdoSmt->bindValue(1, $val, PDO::PARAM_STR);
        $execRe = $this->pdoSmt->execute();
        if (!$execRe) {
            throw new MYSQLException($this->pdoSmt->errorInfo(), $this->pdoSmt->errorCode());
        }

    }
    
    public function addlink($name, $link, $password) {
        $sql = 'INSERT INTO `linkinfo`(`link_url`,`link_name`,`link_passwd`, `link_data`) VALUES(?, ?, ?, ?)';
        $this->pdoSmt = $this->pdoInstance->prepare($sql);
        $this->pdoSmt->bindValue(1, $link, PDO::PARAM_STR);
        $this->pdoSmt->bindValue(2, $name, PDO::PARAM_STR);
        $this->pdoSmt->bindValue(3, $password, PDO::PARAM_STR);
        $this->pdoSmt->bindValue(4, date("Y-m-d"), PDO::PARAM_STR);
        $execRe = $this->pdoSmt->execute();
        if (!$execRe) {
            throw new MYSQLException($this->pdoSmt->errorInfo(), $this->pdoSmt->errorCode());
        }
    }
}

class MYSQLException extends Exception
{

}