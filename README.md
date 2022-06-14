# NTUber eats

NTUber eats is a food delivery platform that allows customers, delivery staff and the restaurants to order and make food with a good deal in ease

# Getting Started
### Prerequisities

JAVA
java JRE library 1.8.0 
mysql-connector-java-8.0.29.jar in our project's build path to make our project run
mysql 8.0.29

### Download and Installation

java 1.8.0
先進去這個網站 https://www.oracle.com/tw/java/technologies/javase/javase8u211-later-archive-downloads.html

找到Java SE Development Kit 8u321和Java SE Runtime Environment 8u321，並視自己的作業系統下載適合的jdk及jre
下載完畢安裝時只要一直按next即可，在C槽的Program files可以找到下載好的檔案

mysql 8.0.29
Windows:
先進去這個網站 https://dev.mysql.com/downloads
點MySQL Installer for Windows，進去後點第一的載點後按No thanks, just start my download
下載完安裝時，setUp type選custom，然後products選最新版的Mysql server，Mysql Workbench及Mysql shell
接下來就是一直next和execute
然後有一步會要求設定資料庫密碼，之後就一直next然後finish，mysql即安裝完成
Mac:
MySQL Community Server
先進去這個網站 https://dev.mysql.com/downloads
點MySQL Community Server，進去後先依照CPU版本至Select OS Version選擇需要的版本，
選擇完之後按第一個載點，然後按No thanks, just start my download
下載完安裝時，點開剛剛下載的東西，有一個package，點開後按允許，
之後就一直繼續，執行，同意，安裝，然後會需要輸入電腦密碼，按next，
然後會會要求設定資料庫密碼，輸完按finish，再輸入一次電腦密碼，然後按關閉。
MySQL Workbench
先進去這個網站 https://dev.mysql.com/downloads
點MySQL Workbench，進去後先確Workbench是否比電腦需求版本高，若是則去更新電腦，然後按載點，
之後按No thanks, just start my download
下載完安裝時，先將畫面上的MySQL Workbench拉到旁邊的Applications，按X結束視窗後，按command+空白鍵
搜尋mysql workbench後將之打開，如果跳出無法打開MySQLWorbench，按顯示於folder
然後對它按右鍵打開，跳出視窗後再按打開，就可以打開MySQLWorbench

mysql-connector-java-8.0.29.jar
進入這個網站 https://dev.mysql.com/downloads/connector/j/?os=26 ，進去後兩個載點
點選上方在點後按No thanks, just start my download
下載完畢，將mysql-connector放在任何你想放的地方，
打開eclipse後打開OOP(我們的project)，在project右鍵選properties->選Java Build Path->Add External jars
->找你要的mysql-connector後案開啟->按Apply->Apply and close

### Usage Example

The main function of this program, which is called Main.java, is in 
foodpanda/code/OOP/src/main
Execute this program by running Main.java

### Check source code

將OOP.zip移到IDE workspace的資料夾解壓縮
打開IDE並匯入OOP的資料夾
main class是main package裡面的Main.java，點開就可以使用這支程式 


# Deployment

一定要安裝mySQL，下載mySQL connector，及將JAVA jre library設定至1.8.0，
否則程式將無法完整執行

# Tools used

MySQL
JDBC
Java swing GUI
Git version control

#Authors

陳宇音 鄭瑋凡 崔永明 鄭芳雯 陳綵瑄
















