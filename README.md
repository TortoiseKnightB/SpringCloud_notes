# SpringCloud_notes

- hosts 配置

```bash
127.0.0.1 eureka7001.com
127.0.0.1 eureka7002.com
127.0.0.1 config-3344.com
```

- nacos 启动

```bash
bash startup.sh -m standalone
# or
startup.cmd -m standalone
```

- nacos 配置 mysql8.0
  - 官方文档坑爹，可以去 nacos 的 github 上查找 issue
  - 确保你在${nacos.home}/plugins/mysql 下挂载了 mysql8.0的驱动
  - 在nacos安装目录下新建plugins/mysql文件夹(plugins和bin,conf在同一层级)，并放入8.0+版本的mysql-connector-java-8.0.xx.jar，这个jar包的版本一定要和你数据版本对应
  - 数据版本查看方式，可以进入数据库，执行 sql 语句 `show variables like '%version%';`  
  - 配置 url 时注意加上时间区域，如 `db.url.0=jdbc:mysql://localhost:3306/nacos_config?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2b8`

