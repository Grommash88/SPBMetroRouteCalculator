# SPBMetroRouteCalculator

The program for making a route and calculating the travel time (approximate) along the St. Petersburg metro:

	-After launch, a metropolitan model is created, the data is parsed from a JSON file located in the resources folder.
	Parsing is implemented in the Parser class.

	-To compose and calculate the route, you must enter the departure and destination stations in the console,
	if one of the stations does not exist in the metro model, a BadCommandException is thrown.

	-Creating a route and calculating the travel time is implemented in the RouteCalculator class, the class is covered with tests.

	-The route and time of the trip are displayed in the console.

	-Added logging of entered existing metro stations, logs are saved to the logs/search.log file,
	non-existent stations, logs are saved to the logs/input_errors.log file, information about caught exceptions,
	logs are saved to the logs/exceptions.log file.

=======================================================================================================

Программа составления маршрута и расчета времени в пути(приблизительного) по метро Санкт-Петербурга:

	-После запуска создается модель метрополина, данные парсятся из JSON файла лежащего в папке resources.
	Парсинг реализован в классе Parser.

	-Для составления и расчета маршрута необходимо ввести в консоль станции отправления и назначения, 
	если одной из станций не существует в моделе метрополитена, выбрасывается BadCommandException.

	-Составление маршрута и расчет времени пути реализованно в классе RouteCalculator, класс покрыт тестами. 

	-Маршрут и время пути выводится в консоль.

	-Добавлено логирование вводимых существующих станций метрополитена, логи сохраняются в файл logs/search.log, 
	несуществующих станций, логи сохраняются в файл logs/input_errors.log, инфомации о перехваченных исключениях,
	логи сохраняются в файл logs/exceptions.log. 
