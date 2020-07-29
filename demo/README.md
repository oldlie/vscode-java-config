# Ubuntu(优麒麟)设置Java环境变量

主要是新的VSCode必须要设置系统环境变量才让用。本来是不想设置系统环境变量的，像IDEA一样不同的应用使用不同的版本的JDK就好。削微有点儿无奈。

```bash
$ sudo vim /etc/envrioment
```

```bash
PATH="/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:$JAVA_HOME/bin"
export CLASSPATH=.:$JAVA_HOME/lib
export JAVA_HOME=/home/oldlie/dev/env/jdk-14.0.2
```