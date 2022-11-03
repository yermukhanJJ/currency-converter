# currency-converter

# Перед вами RestFul приложение для конвертаций валют

# Информация о курсе валют взял из Центр банка https://cbr.ru/scripts/XML_daily.asp

# При запросе GET http://localhost:8081/getCourse данные из скрипта сохраняются на базе

# Для тестирование запросов использовал postman

![image](https://user-images.githubusercontent.com/98425087/199728626-36f3a412-b7ab-4604-865b-422c08e1565f.png)

# Для базы данных использовал postgreSql

![image](https://user-images.githubusercontent.com/98425087/199729407-38693a9b-e009-42e4-86ed-958615dcc6cb.png)

# Чтобы выполнить конвертацию валют исползуется POST http://localhost:8081/converter?from=USD&to=KZT

![image](https://user-images.githubusercontent.com/98425087/199729920-e82e3430-59e5-4680-8a84-ad45dd3fa926.png)
