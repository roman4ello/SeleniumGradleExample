
**This is my example of HOW easy it is to start in selenium or selenide - a couple of examples**

```ENG SELENIUM```
1. Create a project
2. Connect dependency to the selenium library (for the whole or for a specific diver)
     
     implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.0.0-beta-3'

3. Download chromedriver (geckodriver) from selenium site https://www.selenium.dev/documentation/en/webdriver/driver_requirements/#quick-reference
4. In the project, specify the path to this file. If you are on MacOs -you do not need to specify path to the driver in the code, but need to have driver in the path: 

      "/usr/local/bin/HERE_DRIVER"

5. Run the launch using the methods already described in SeleniumPureExampleMain.java

 

```RUS SELENIUM```
1. Создать проект
2. Подключить зависимость на селениум бибиотеку (на всю или на конкретный дайвер)
    implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.0.0-beta-3'

3. Скачать chromedriver(geckodriver) с сайта selenium https://www.selenium.dev/documentation/en/webdriver/driver_requirements/#quick-reference
4. В проекте указать путь к этому файлу. Если Вы используете MacOs, то Вам не нужно указывать драйвер, он автоматически будет искаться по пути:
 "/usr/local/bin/HERE_DRIVER". Если его там нет, перенесите драйвер по этому пути.
 
5. Выполнить запуск используя уже описанные методы в SeleniumPureExampleMain.java 
  
