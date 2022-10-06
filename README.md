# RateAnalizator
API connect API which produce rate currency and analyze 
Docker images for run this API https://hub.docker.com/r/pohikoo/rate-analizator
API deploys in server.port=8085 


Создать сервис, который обращается к сервису курсов валют, и отдает gif в ответ: 
если курс по отношению к рублю за сегодня стал выше вчерашнего, то отдаем рандомную отсюда https://giphy.com/search/rich 
если ниже - отсюда https://giphy.com/search/broke 
Ссылки 
REST API курсов валют - https://docs.openexchangerates.org/ 
REST API гифок - https://developers.giphy.com/docs/api#quick-start-guide 
Must Have 
Сервис на Spring Boot 2 + Java 

Для взаимодействия с внешними сервисами используется Feign 
Все параметры (валюта по отношению к которой смотрится курс, адреса внешних сервисов и т.д.) вынесены в настройки 
 
Для сборки должен использоваться Maven 
Результатом выполнения должен быть репо на GitHub с инструкцией по запуску 
Nice to Have 
Сборка и запуск Docker контейнера с этим сервисом 


