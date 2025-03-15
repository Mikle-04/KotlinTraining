package com.example.kotlintraining.data.db

import com.example.kotlintraining.data.db.dao.AppDao
import com.example.kotlintraining.data.db.models.Question
import com.example.kotlintraining.data.db.models.Theory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

suspend fun populateDatabase(dao: AppDao) {
    withContext(Dispatchers.IO) {
        val questions = mutableListOf<Question>().apply {
            // Категория 1: Основы (30 вопросов)
            addAll(
                listOf(
                    Question(
                        text = "Что обозначает 'val' в Kotlin?",
                        options = listOf("Изменяемая переменная", "Константа", "Функция", "Класс"),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Какой тип возвращает функция без return?",
                        options = listOf("Void", "Unit", "Nothing", "Null"),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Как объявить переменную с возможным null?",
                        options = listOf(
                            "var x: String",
                            "var x: String?",
                            "var x: Null",
                            "var x = null"
                        ),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Что делает оператор '?:' в Kotlin?",
                        options = listOf(
                            "Проверка условия",
                            "Элвис-оператор",
                            "Сравнение",
                            "Логическое ИЛИ"
                        ),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Какой символ начинает однострочный комментарий?",
                        options = listOf("//", "/*", "#", "--"),
                        correctAnswerIndex = 0,
                        category = "Основы"
                    ),
                    Question(
                        text = "Как объявить функцию в Kotlin?",
                        options = listOf("fun", "function", "def", "proc"),
                        correctAnswerIndex = 0,
                        category = "Основы"
                    ),
                    Question(
                        text = "Что делает оператор '..' в Kotlin?",
                        options = listOf(
                            "Создаёт диапазон",
                            "Сравнивает значения",
                            "Объединяет строки",
                            "Делит числа"
                        ),
                        correctAnswerIndex = 0,
                        category = "Основы"
                    ),
                    Question(
                        text = "Какой тип данных используется для целых чисел?",
                        options = listOf("Int", "Float", "String", "Boolean"),
                        correctAnswerIndex = 0,
                        category = "Основы"
                    ),
                    Question(
                        text = "Что означает 'String?' в объявлении переменной?",
                        options = listOf(
                            "Строка не может быть пустой",
                            "Строка может быть null",
                            "Строка неизменяемая",
                            "Строка только для чтения"
                        ),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Какой оператор используется для строгого равенства?",
                        options = listOf("==", "===", "equals()", "is"),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Что вернёт выражение 'if (true) 5 else 10'?",
                        options = listOf("5", "10", "true", "false"),
                        correctAnswerIndex = 0,
                        category = "Основы"
                    ),
                    Question(
                        text = "Как объявить константу на уровне файла?",
                        options = listOf("val", "const val", "var", "static val"),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Что делает 'when' в Kotlin?",
                        options = listOf(
                            "Цикл",
                            "Условный оператор",
                            "Объявление функции",
                            "Исключение"
                        ),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Какой тип возвращает функция, бросающая исключение?",
                        options = listOf("Unit", "Nothing", "Void", "Exception"),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Как проверить тип переменной?",
                        options = listOf("is", "as", "typeof", "instanceof"),
                        correctAnswerIndex = 0,
                        category = "Основы"
                    ),
                    Question(
                        text = "Что делает оператор 'as'?",
                        options = listOf(
                            "Проверка типа",
                            "Приведение типа",
                            "Создание объекта",
                            "Сравнение"
                        ),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Какой модификатор делает переменную приватной?",
                        options = listOf("private", "public", "protected", "internal"),
                        correctAnswerIndex = 0,
                        category = "Основы"
                    ),
                    Question(
                        text = "Что такое 'Unit' в Kotlin?",
                        options = listOf(
                            "Пустой тип",
                            "Аналог void",
                            "Тип для null",
                            "Тип исключения"
                        ),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Какой оператор используется для безопасного вызова?",
                        options = listOf("?.", "!!", "?:", "?.let"),
                        correctAnswerIndex = 0,
                        category = "Основы"
                    ),
                    Question(
                        text = "Что делает '!!' с переменной?",
                        options = listOf(
                            "Проверяет null",
                            "Утверждает не-null",
                            "Создаёт копию",
                            "Вызывает исключение"
                        ),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Как объявить лямбда-выражение?",
                        options = listOf(
                            "{ x -> x + 1 }",
                            "fun(x) { x + 1 }",
                            "lambda x: x + 1",
                            "(x) => x + 1"
                        ),
                        correctAnswerIndex = 0,
                        category = "Основы"
                    ),
                    Question(
                        text = "Что возвращает 'return@label'?",
                        options = listOf(
                            "Выход из функции",
                            "Выход из лямбды",
                            "Переход к метке",
                            "Исключение"
                        ),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Какой цикл используется для итерации по диапазону?",
                        options = listOf("for", "while", "do-while", "repeat"),
                        correctAnswerIndex = 0,
                        category = "Основы"
                    ),
                    Question(
                        text = "Что делает 'break' в цикле?",
                        options = listOf(
                            "Пропускает итерацию",
                            "Прерывает цикл",
                            "Перезапускает цикл",
                            "Вызывает ошибку"
                        ),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Какой метод преобразует строку в число?",
                        options = listOf("toInt()", "parseInt()", "convert()", "cast()"),
                        correctAnswerIndex = 0,
                        category = "Основы"
                    ),
                    Question(
                        text = "Что делает 'else' в 'when'?",
                        options = listOf(
                            "Указывает условие",
                            "Обрабатывает остальные случаи",
                            "Создаёт ветку",
                            "Вызывает исключение"
                        ),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Как объявить массив в Kotlin?",
                        options = listOf(
                            "arrayOf()",
                            "listOf()",
                            "setOf()",
                            "mapOf()"
                        ),
                        correctAnswerIndex = 0,
                        category = "Основы"
                    ),
                    Question(
                        text = "Что такое 'in' в Kotlin?",
                        options = listOf(
                            "Проверка принадлежности",
                            "Логическое И",
                            "Приведение типа",
                            "Условный оператор"
                        ),
                        correctAnswerIndex = 0,
                        category = "Основы"
                    ),
                    Question(
                        text = "Какой тип данных для чисел с плавающей точкой?",
                        options = listOf("Int", "Double", "Char", "Boolean"),
                        correctAnswerIndex = 1,
                        category = "Основы"
                    ),
                    Question(
                        text = "Что делает 'println()'?",
                        options = listOf(
                            "Выводит в консоль",
                            "Читает ввод",
                            "Создаёт строку",
                            "Вызывает ошибку"
                        ),
                        correctAnswerIndex = 0,
                        category = "Основы"
                    )
                )
            )

            // Категория 2: ООП (30 вопросов)
            addAll(
                listOf(
                    Question(
                        text = "Какой модификатор позволяет наследовать класс?",
                        options = listOf("open", "abstract", "final", "sealed"),
                        correctAnswerIndex = 0,
                        category = "ООП"
                    ),
                    Question(
                        text = "Что такое data class в Kotlin?",
                        options = listOf(
                            "Класс для хранения данных",
                            "Абстрактный класс",
                            "Интерфейс",
                            "Обычный класс"
                        ),
                        correctAnswerIndex = 0,
                        category = "ООП"
                    ),
                    Question(
                        text = "Какой метод вызывается при создании объекта?",
                        options = listOf("init", "constructor", "start", "create"),
                        correctAnswerIndex = 0,
                        category = "ООП"
                    ),
                    Question(
                        text = "Что делает 'override'?",
                        options = listOf(
                            "Создаёт новый метод",
                            "Переопределяет метод",
                            "Скрывает метод",
                            "Удаляет метод"
                        ),
                        correctAnswerIndex = 1,
                        category = "ООП"
                    ),
                    Question(
                        text = "Может ли интерфейс содержать реализацию?",
                        options = listOf("Нет", "Да", "Только в Java", "Только абстрактно"),
                        correctAnswerIndex = 1,
                        category = "ООП"
                    ),
                    Question(
                        text = "Какой принцип ООП отвечает за скрытие внутренней реализации?",
                        options = listOf(
                            "Наследование",
                            "Полиморфизм",
                            "Инкапсуляция",
                            "Абстракция"
                        ),
                        correctAnswerIndex = 2,
                        category = "ООП"
                    ),
                    Question(
                        text = "Какой модификатор в Kotlin позволяет переопределять метод?",
                        options = listOf("open", "final", "sealed", "private"),
                        correctAnswerIndex = 0,
                        category = "ООП"
                    ),
                    Question(
                        text = "Что такое полиморфизм в ООП?",
                        options = listOf(
                            "Способность объекта иметь несколько форм",
                            "Создание множества объектов",
                            "Скрытие данных",
                            "Передача свойств"
                        ),
                        correctAnswerIndex = 0,
                        category = "ООП"
                    ),
                    Question(
                        text = "Какой класс в Kotlin является родительским для всех классов?",
                        options = listOf("Object", "Any", "Base", "Root"),
                        correctAnswerIndex = 1,
                        category = "ООП"
                    ),
                    Question(
                        text = "Что такое абстрактный класс в Kotlin?",
                        options = listOf(
                            "Класс, который нельзя наследовать",
                            "Класс с реализацией всех методов",
                            "Класс, который нельзя инстанцировать",
                            "Класс только с свойствами"
                        ),
                        correctAnswerIndex = 2,
                        category = "ООП"
                    ),
                    Question(
                        text = "Какой модификатор используется для запрета переопределения?",
                        options = listOf("open", "final", "abstract", "override"),
                        correctAnswerIndex = 1,
                        category = "ООП"
                    ),
                    Question(
                        text = "Что такое 'super' в Kotlin?",
                        options = listOf(
                            "Ссылка на дочерний класс",
                            "Ссылка на родительский класс",
                            "Создание нового объекта",
                            "Модификатор доступа"
                        ),
                        correctAnswerIndex = 1,
                        category = "ООП"
                    ),
                    Question(
                        text = "Может ли класс в Kotlin наследовать несколько классов?",
                        options = listOf(
                            "Да",
                            "Нет",
                            "Только с интерфейсами",
                            "Только абстрактные"
                        ),
                        correctAnswerIndex = 1,
                        category = "ООП"
                    ),
                    Question(
                        text = "Что такое интерфейс в ООП?",
                        options = listOf(
                            "Класс с полной реализацией",
                            "Контракт поведения",
                            "Статический объект",
                            "Закрытый класс"
                        ),
                        correctAnswerIndex = 1,
                        category = "ООП"
                    ),
                    Question(
                        text = "Какой символ используется для наследования в Kotlin?",
                        options = listOf(":", "->", "::", ".."),
                        correctAnswerIndex = 0,
                        category = "ООП"
                    ),
                    Question(
                        text = "Что такое 'this' в Kotlin?",
                        options = listOf(
                            "Ссылка на родительский класс",
                            "Ссылка на текущий объект",
                            "Ссылка на интерфейс",
                            "Ссылка на статический метод"
                        ),
                        correctAnswerIndex = 1,
                        category = "ООП"
                    ),
                    Question(
                        text = "Может ли 'data class' быть абстрактным?",
                        options = listOf(
                            "Да",
                            "Нет",
                            "Только с модификатором",
                            "Только в интерфейсе"
                        ),
                        correctAnswerIndex = 1,
                        category = "ООП"
                    ),
                    Question(
                        text = "Какой принцип ООП позволяет использовать один интерфейс для разных реализаций?",
                        options = listOf(
                            "Инкапсуляция",
                            "Наследование",
                            "Полиморфизм",
                            "Абстракция"
                        ),
                        correctAnswerIndex = 2,
                        category = "ООП"
                    ),
                    Question(
                        text = "Что такое 'companion object' в контексте ООП?",
                        options = listOf(
                            "Статическая часть класса",
                            "Дочерний класс",
                            "Интерфейс",
                            "Абстрактный метод"
                        ),
                        correctAnswerIndex = 0,
                        category = "ООП"
                    ),
                    Question(
                        text = "Какой модификатор видимости обеспечивает инкапсуляцию?",
                        options = listOf("public", "private", "protected", "internal"),
                        correctAnswerIndex = 1,
                        category = "ООП"
                    ),
                    Question(
                        text = "Что делает 'sealed class' в контексте ООП?",
                        options = listOf(
                            "Ограничивает наследование",
                            "Запрещает создание объектов",
                            "Делает класс абстрактным",
                            "Открывает класс для всех"
                        ),
                        correctAnswerIndex = 0,
                        category = "ООП"
                    ),
                    Question(
                        text = "Может ли интерфейс наследовать другой интерфейс?",
                        options = listOf("Нет", "Да", "Только с классом", "Только с реализацией"),
                        correctAnswerIndex = 1,
                        category = "ООП"
                    ),
                    Question(
                        text = "Что такое делегирование в Kotlin?",
                        options = listOf(
                            "Передача ответственности другому объекту",
                            "Создание нового класса",
                            "Переопределение метода",
                            "Скрытие данных"
                        ),
                        correctAnswerIndex = 0,
                        category = "ООП"
                    ),
                    Question(
                        text = "Какой ключевое слово используется для делегирования в интерфейсе?",
                        options = listOf("by", "as", "is", "in"),
                        correctAnswerIndex = 0,
                        category = "ООП"
                    ),
                    Question(
                        text = "Что такое 'lateinit' в контексте ООП?",
                        options = listOf(
                            "Отложенная инициализация свойства",
                            "Создание абстрактного класса",
                            "Наследование метода",
                            "Закрытие доступа"
                        ),
                        correctAnswerIndex = 0,
                        category = "ООП"
                    ),
                    Question(
                        text = "Какой модификатор позволяет обращаться к членам суперкласса?",
                        options = listOf("public", "protected", "private", "internal"),
                        correctAnswerIndex = 1,
                        category = "ООП"
                    ),
                    Question(
                        text = "Что такое 'object' в Kotlin?",
                        options = listOf(
                            "Синглтон",
                            "Абстрактный класс",
                            "Интерфейс",
                            "Обычный класс"
                        ),
                        correctAnswerIndex = 0,
                        category = "ООП"
                    ),
                    Question(
                        text = "Может ли класс быть одновременно 'sealed' и 'open'?",
                        options = listOf("Да", "Нет", "Только с интерфейсом", "Только в модуле"),
                        correctAnswerIndex = 1,
                        category = "ООП"
                    ),
                    Question(
                        text = "Что такое вторичный конструктор в ООП?",
                        options = listOf(
                            "Дополнительный способ создания объекта",
                            "Переопределённый метод",
                            "Статический конструктор",
                            "Абстрактный конструктор"
                        ),
                        correctAnswerIndex = 0,
                        category = "ООП"
                    ),
                    Question(
                        text = "Какой принцип ООП реализует 'abstract class'?",
                        options = listOf(
                            "Инкапсуляция",
                            "Наследование",
                            "Абстракция",
                            "Полиморфизм"
                        ),
                        correctAnswerIndex = 2,
                        category = "ООП"
                    )
                )
            )

            // Категория 3: Корутины (30 вопросов)
            addAll(
                listOf(
                    Question(
                        text = "Что делает 'suspend' в Kotlin?",
                        options = listOf(
                            "Делает функцию асинхронной",
                            "Запускает поток",
                            "Блокирует выполнение",
                            "Создаёт класс"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Какой Scope используется для глобальных корутин?",
                        options = listOf("GlobalScope", "CoroutineScope", "MainScope", "AppScope"),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что такое Dispatchers.IO?",
                        options = listOf(
                            "Для UI",
                            "Для ввода-вывода",
                            "Для вычислений",
                            "Для тестов"
                        ),
                        correctAnswerIndex = 1,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что возвращает Job?",
                        options = listOf("Результат", "Состояние корутины", "Поток", "Исключение"),
                        correctAnswerIndex = 1,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Как отменить корутину?",
                        options = listOf("stop()", "cancel()", "pause()", "break()"),
                        correctAnswerIndex = 1,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что такое корутина в Kotlin?",
                        options = listOf(
                            "Лёгкий поток",
                            "Асинхронная функция",
                            "Класс для данных",
                            "Интерфейс"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Какой модификатор делает функцию доступной только в корутинах?",
                        options = listOf("async", "suspend", "launch", "run"),
                        correctAnswerIndex = 1,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что делает 'launch' в корутинах?",
                        options = listOf(
                            "Создаёт и запускает корутину",
                            "Ждёт завершения",
                            "Возвращает результат",
                            "Останавливает выполнение"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Какой строитель возвращает результат корутины?",
                        options = listOf("launch", "async", "withContext", "runBlocking"),
                        correctAnswerIndex = 1,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что такое 'Deferred' в Kotlin?",
                        options = listOf(
                            "Отложенный результат корутины",
                            "Тип диспетчера",
                            "Состояние потока",
                            "Контекст выполнения"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Какой метод ждёт результат 'Deferred'?",
                        options = listOf("await()", "get()", "join()", "result()"),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что делает 'runBlocking'?",
                        options = listOf(
                            "Запускает корутину и блокирует поток",
                            "Создаёт асинхронную задачу",
                            "Останавливает корутину",
                            "Переключает контекст"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Какой диспетчер используется для задач на главном потоке?",
                        options = listOf(
                            "Dispatchers.Main",
                            "Dispatchers.IO",
                            "Dispatchers.Default",
                            "Dispatchers.Unconfined"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что такое 'CoroutineScope'?",
                        options = listOf(
                            "Область выполнения корутин",
                            "Тип результата",
                            "Диспетчер потоков",
                            "Функция запуска"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Какой метод объединяет корутину с её родителем?",
                        options = listOf("join()", "await()", "launch()", "supervisorScope()"),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что делает 'withContext'?",
                        options = listOf(
                            "Переключает диспетчер корутины",
                            "Создаёт новую корутину",
                            "Останавливает выполнение",
                            "Возвращает Job"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Какой диспетчер подходит для вычислительных задач?",
                        options = listOf(
                            "Dispatchers.Main",
                            "Dispatchers.IO",
                            "Dispatchers.Default",
                            "Dispatchers.Unconfined"
                        ),
                        correctAnswerIndex = 2,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что такое 'supervisorScope'?",
                        options = listOf(
                            "Область, где ошибки дочерних корутин не влияют на родителя",
                            "Область для блокировки",
                            "Контекст для UI",
                            "Тип результата"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Как обработать исключение в корутине?",
                        options = listOf(
                            "try-catch",
                            "if-else",
                            "when",
                            "return"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что такое 'CoroutineExceptionHandler'?",
                        options = listOf(
                            "Обработчик исключений для корутин",
                            "Тип диспетчера",
                            "Состояние корутины",
                            "Метод завершения"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Может ли корутина запускаться без 'Scope'?",
                        options = listOf("Да", "Нет", "Только с GlobalScope", "Только в тестах"),
                        correctAnswerIndex = 1,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что делает 'Dispatchers.Unconfined'?",
                        options = listOf(
                            "Запускает корутину без привязки к потоку",
                            "Ограничивает выполнение",
                            "Переключает на IO",
                            "Блокирует поток"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Какой метод приостанавливает корутину на время?",
                        options = listOf("delay()", "sleep()", "pause()", "wait()"),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что возвращает 'async' строитель?",
                        options = listOf("Job", "Deferred", "Unit", "Nothing"),
                        correctAnswerIndex = 1,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Какой контекст используется, если диспетчер не указан?",
                        options = listOf(
                            "Контекст родительской корутины",
                            "Dispatchers.Main",
                            "Dispatchers.IO",
                            "GlobalScope"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что делает 'yield()' в корутинах?",
                        options = listOf(
                            "Уступает выполнение другим корутинам",
                            "Завершает корутину",
                            "Ждёт результата",
                            "Переключает поток"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Может ли 'launch' возвращать результат?",
                        options = listOf("Да", "Нет", "Только с await", "Только в GlobalScope"),
                        correctAnswerIndex = 1,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что такое 'coroutineContext'?",
                        options = listOf(
                            "Набор элементов, определяющих поведение корутины",
                            "Тип результата",
                            "Функция запуска",
                            "Состояние потока"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Какой строитель используется для тестирования корутин?",
                        options = listOf("runBlocking", "launch", "async", "withContext"),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    ),
                    Question(
                        text = "Что делает 'isActive' в корутинах?",
                        options = listOf(
                            "Проверяет, активна ли корутина",
                            "Запускает корутину",
                            "Останавливает выполнение",
                            "Возвращает результат"
                        ),
                        correctAnswerIndex = 0,
                        category = "Корутины"
                    )
                )
            )

            // Категория 4: Коллекции (30 вопросов)
            addAll(
                listOf(
                    Question(
                        text = "Какая коллекция неизменяемая по умолчанию?",
                        options = listOf("List", "MutableList", "Array", "Set"),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что делает 'map' для списка?",
                        options = listOf(
                            "Фильтрует элементы",
                            "Преобразует элементы",
                            "Сортирует",
                            "Удаляет элементы"
                        ),
                        correctAnswerIndex = 1,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Как создать пустой список?",
                        options = listOf(
                            "listOf()",
                            "mutableListOf()",
                            "emptyList()",
                            "arrayListOf()"
                        ),
                        correctAnswerIndex = 2,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что делает 'filter'?",
                        options = listOf(
                            "Преобразует",
                            "Фильтрует по условию",
                            "Объединяет",
                            "Разделяет"
                        ),
                        correctAnswerIndex = 1,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Какая коллекция не допускает дубликаты?",
                        options = listOf("List", "Set", "Map", "Array"),
                        correctAnswerIndex = 1,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что делает 'mutableListOf()'?",
                        options = listOf(
                            "Создаёт неизменяемый список",
                            "Создаёт изменяемый список",
                            "Создаёт пустой массив",
                            "Создаёт множество"
                        ),
                        correctAnswerIndex = 1,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Как получить элемент по ключу в Map?",
                        options = listOf("get()", "find()", "take()", "indexOf()"),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что делает 'forEach' для коллекции?",
                        options = listOf(
                            "Применяет действие к каждому элементу",
                            "Фильтрует элементы",
                            "Сортирует коллекцию",
                            "Объединяет элементы"
                        ),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Какая функция сортирует список?",
                        options = listOf("sort()", "sorted()", "filter()", "map()"),
                        correctAnswerIndex = 1,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что возвращает 'toSet()' для списка?",
                        options = listOf(
                            "Множество без дубликатов",
                            "Отсортированный список",
                            "Изменяемый список",
                            "Массив"
                        ),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Какой метод добавляет элемент в MutableList?",
                        options = listOf("add()", "put()", "insert()", "append()"),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что делает 'distinct()'?",
                        options = listOf(
                            "Удаляет дубликаты",
                            "Сортирует элементы",
                            "Фильтрует по условию",
                            "Преобразует элементы"
                        ),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Какой тип коллекции упорядочен по умолчанию?",
                        options = listOf("Set", "List", "Map", "HashSet"),
                        correctAnswerIndex = 1,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что делает 'groupBy()'?",
                        options = listOf(
                            "Группирует элементы по ключу",
                            "Сортирует элементы",
                            "Фильтрует элементы",
                            "Объединяет коллекции"
                        ),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Как проверить, пустая ли коллекция?",
                        options = listOf("isEmpty()", "isNull()", "size == 0", "contains(null)"),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что возвращает 'first()'?",
                        options = listOf(
                            "Первый элемент",
                            "Последний элемент",
                            "Случайный элемент",
                            "Список элементов"
                        ),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Какой метод объединяет две коллекции?",
                        options = listOf("plus()", "merge()", "union()", "join()"),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что делает 'any()'?",
                        options = listOf(
                            "Проверяет, есть ли элемент, удовлетворяющий условию",
                            "Возвращает все элементы",
                            "Удаляет элементы",
                            "Сортирует коллекцию"
                        ),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Как создать неизменяемое множество?",
                        options = listOf(
                            "setOf()",
                            "mutableSetOf()",
                            "hashSetOf()",
                            "emptySetOf()"
                        ),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что делает 'flatMap()'?",
                        options = listOf(
                            "Преобразует и сглаживает коллекцию",
                            "Фильтрует элементы",
                            "Группирует элементы",
                            "Сортирует коллекцию"
                        ),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Какой метод удаляет элемент из MutableSet?",
                        options = listOf("remove()", "delete()", "drop()", "clear()"),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что делает 'zip()' для двух коллекций?",
                        options = listOf(
                            "Создаёт пары из элементов",
                            "Сортирует элементы",
                            "Фильтрует элементы",
                            "Объединяет в одну коллекцию"
                        ),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что возвращает 'take(n)'?",
                        options = listOf(
                            "Первые n элементов",
                            "Последние n элементов",
                            "Случайные n элементов",
                            "Отфильтрованные элементы"
                        ),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Какой метод проверяет наличие элемента в коллекции?",
                        options = listOf("contains()", "has()", "exists()", "includes()"),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что делает 'reduce()'?",
                        options = listOf(
                            "Сворачивает коллекцию в одно значение",
                            "Преобразует элементы",
                            "Фильтрует элементы",
                            "Группирует элементы"
                        ),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Какой тип коллекции лучше всего подходит для быстрого поиска по ключу?",
                        options = listOf("List", "Set", "Map", "Array"),
                        correctAnswerIndex = 2,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что делает 'drop(n)'?",
                        options = listOf(
                            "Удаляет первые n элементов",
                            "Берёт первые n элементов",
                            "Сортирует n элементов",
                            "Фильтрует n элементов"
                        ),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Как создать неизменяемую карту?",
                        options = listOf("mapOf()", "mutableMapOf()", "hashMapOf()", "emptyMap()"),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    ),
                    Question(
                        text = "Что делает 'all()'?",
                        options = listOf(
                            "Проверяет, все ли элементы удовлетворяют условию",
                            "Возвращает все элементы",
                            "Удаляет все элементы",
                            "Сортирует все элементы"
                        ),
                        correctAnswerIndex = 0,
                        category = "Коллекции"
                    )

                )
            )
        }


        // 150 тем теории
        val theory = mutableListOf<Theory>().apply {
            // Категория 1: Основы (30 тем)
            addAll(
                listOf(
                    Theory(
                        title = "Переменные в Kotlin",
                        content = "Переменные в Kotlin — это основа для хранения данных в программе. Kotlin предлагает простой и безопасный подход к их объявлению и использованию, минимизируя ошибки благодаря строгой типизации и поддержке вывода типов. Давайте разберём всё по порядку: как объявлять переменные, какие есть ключевые слова, типы и особенности.\n" +
                                "\n" +
                                "1. Объявление переменных\n" +
                                "В Kotlin есть два основных ключевых слова для объявления переменных: val и var.\n" +
                                "\n" +
                                "val (value) — неизменяемая переменная (аналог final в Java). После присваивания значения его нельзя изменить.\n" +
                                "val name = \"Алексей\"\n" +
                                "// name = \"Иван\" // Ошибка: val нельзя переприсвоить\n" +
                                "var (variable) — изменяемая переменная. Её значение можно менять.\n" +
                                "var age = 25\n" +
                                "age = 26 // OK\n" +
                                "Когда использовать:\n" +
                                "Используйте val, если значение не будет меняться (это предпочтительный вариант в Kotlin для уменьшения случайных изменений).\n" +
                                "Используйте var, если переменная должна изменяться.\n" +
                                "2. Типы переменных\n" +
                                "Kotlin — строго типизированный язык, но благодаря выводу типов (type inference) вам не всегда нужно явно указывать тип. Компилятор сам определяет его по присвоенному значению.\n" +
                                "\n" +
                                "Без явного указания типа:\n" +
                                "val number = 42 // Компилятор понимает, что это Int\n" +
                                "val text = \"Привет\" // String\n" +
                                "С явным указанием типа:\n" +
                                "val number: Int = 42\n" +
                                "val text: String = \"Привет\"\n" +
                                "Основные типы данных:\n" +
                                "Числовые:\n" +
                                "Byte (8 бит), Short (16 бит), Int (32 бита), Long (64 бита).\n" +
                                "Float (32 бита с плавающей точкой), Double (64 бита с плавающей точкой).\n" +
                                "val small: Byte = 127\n" +
                                "val big: Long = 123456789L // Суффикс L для Long\n" +
                                "val pi: Float = 3.14F // Суффикс F для Float\n" +
                                "Символы: Char — один символ.\n" +
                                "val letter: Char = 'A'\n" +
                                "Логический: Boolean — true или false.\n" +
                                "val isActive: Boolean = true\n" +
                                "Строки: String — последовательность символов.\n" +
                                "val greeting: String = \"Hello, Kotlin!\"\n" +
                                "Массивы и коллекции: Array, List, Set, Map (о них чуть ниже).\n" +
                                "3. Инициализация переменных\n" +
                                "Переменные, объявленные с val или var, должны быть инициализированы сразу, если вы работаете в обычном коде.\n" +
                                "val name = \"Катя\" // OK\n" +
                                "// val name // Ошибка: нужно указать значение\n" +
                                "В классах или функциях можно отложить инициализацию с помощью lateinit (только для var) или указать тип явно:\n" +
                                "class Example {\n" +
                                "    lateinit var message: String // Инициализация позже\n" +
                                "    fun init() {\n" +
                                "        message = \"Привет\"\n" +
                                "    }\n" +
                                "}\n" +
                                "Ограничение: lateinit нельзя использовать с val или с примитивными типами (Int, Double и т.д.).",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Тип возврата функции",
                        content = "В Kotlin функции без явного 'return' возвращают 'Unit' — тип, аналогичный 'void' в других языках. " +
                                "Пример: fun sayHello() { println(\"Hi\") } возвращает Unit. " +
                                "Это важно в ООП для методов, которые изменяют состояние объекта, но не возвращают данные. " +
                                "'Unit' автоматически подразумевается, если тип не указан.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Null-безопасность",
                        content = "Для объявления переменной, которая может быть null, используется '?'. " +
                                "Пример: var x: String? = null позволяет null, а var x: String — нет. " +
                                "Это ключевая особенность Kotlin для предотвращения NullPointerException в ООП, " +
                                "обеспечивая безопасную работу с объектами.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Элвис-оператор",
                        content = "Оператор '?:' (Элвис-оператор) возвращает значение по умолчанию, если выражение слева null. " +
                                "Пример: val result = name ?: \"Unknown\" — если name null, вернётся \"Unknown\". " +
                                "В ООП это помогает обрабатывать nullable-свойства объектов без лишних проверок.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Комментарии в коде",
                        content = "Однострочные комментарии в Kotlin начинаются с '//', многострочные — с '/* */'. " +
                                "Пример: // Это комментарий. В ООП комментарии важны для документирования классов, " +
                                "методов и логики, улучшая читаемость кода.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Объявление функций",
                        content = "Функции в Kotlin объявляются с помощью 'fun'. Пример: fun add(a: Int, b: Int): Int = a + b. " +
                                "В ООП функции часто используются как методы классов, реализующие поведение объектов. " +
                                "Тип возврата указывается после параметров или выводится автоматически.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Диапазоны",
                        content = "Оператор '..' создаёт диапазон значений. Пример: for (i in 1..5) перебирает числа от 1 до 5. " +
                                "В ООП диапазоны полезны для работы с коллекциями или итерации по свойствам объекта.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Типы данных",
                        content = "Для целых чисел в Kotlin используется тип 'Int'. Пример: val number: Int = 42. " +
                                "Типы данных — основа для определения свойств объектов в ООП, обеспечивая строгую типизацию.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Null-безопасность строк",
                        content = "'String?' указывает, что строка может быть null. Пример: val text: String? = null. " +
                                "В ООП это важно для предотвращения ошибок при работе с nullable-полями объектов.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Сравнение объектов",
                        content = "Оператор '===' проверяет строгое равенство (одинаковые ссылки на объект). " +
                                "Пример: a === b. В ООП это важно для сравнения экземпляров классов, в отличие от '==', " +
                                "который сравнивает содержимое.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "If как выражение",
                        content = "В Kotlin 'if' может быть выражением, возвращающим значение. " +
                                "Пример: val result = if (true) 5 else 10 вернёт 5. " +
                                "В ООП это удобно для инициализации свойств объектов на основе условий.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Константы",
                        content = "'const val' объявляет константу времени компиляции на уровне файла или в объекте. " +
                                "Пример: const val PI = 3.14. В ООП используется для неизменяемых глобальных значений.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Условный оператор when",
                        content = "'when' — это мощный условный оператор, аналог switch. " +
                                "Пример: when (x) { 1 -> println(\"One\") else -> println(\"Other\") }. " +
                                "В ООП полезен для выбора поведения объекта в зависимости от состояния.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Тип Nothing",
                        content = "'Nothing' — тип, указывающий, что функция никогда не завершится нормально " +
                                "(например, бросает исключение). Пример: fun fail(): Nothing = throw Exception(). " +
                                "В ООП используется для обработки ошибок в методах.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Проверка типов",
                        content = "Оператор 'is' проверяет тип переменной. Пример: if (x is String) проверяет, " +
                                "является ли x строкой. В ООП это важно для полиморфизма и работы с иерархией классов.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Приведение типов",
                        content = "Оператор 'as' приводит переменную к указанному типу. Пример: val str = obj as String. " +
                                "В ООП используется для работы с объектами разных типов в иерархии наследования.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Модификаторы доступа",
                        content = "'private' ограничивает доступ к членам класса. Пример: private val x = 5. " +
                                "В ООП это реализует инкапсуляцию, защищая внутреннее состояние объекта.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Тип Unit",
                        content = "'Unit' — это тип, обозначающий отсутствие значимого возвращаемого значения, " +
                                "аналог 'void'. Пример: fun print() = println(\"Hi\") возвращает Unit. " +
                                "В ООП используется в методах без результата.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Безопасный вызов",
                        content = "Оператор '?.' выполняет безопасный вызов метода или свойства, если объект не null. " +
                                "Пример: obj?.length. В ООП это упрощает работу с nullable-объектами.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Не-null утверждение",
                        content = "Оператор '!!' утверждает, что значение не null, иначе бросает исключение. " +
                                "Пример: val len = str!!.length. В ООП используется, когда null невозможен по логике.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Лямбда-выражения",
                        content = "Лямбда-выражения объявляются в фигурных скобках: { x -> x + 1 }. " +
                                "Пример: val sum = { a, b -> a + b }. В ООП лямбды часто используются как поведение объектов.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Возврат из лямбды",
                        content = "'return@label' позволяет выйти из лямбда-выражения. " +
                                "Пример: list.forEach { if (it > 0) return@forEach }. " +
                                "В ООП полезно для управления логикой внутри методов.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Циклы",
                        content = "Цикл for в Kotlin используется для перебора элементов в коллекциях, диапазонах или других итерируемых объектах " +
                                "\nПример: \nfor (i in 1..5) {\n" +
                                "    println(i) // Вывод: 1, 2, 3, 4, 5\n" +
                                "}" + "\nval fruits = listOf(\"Яблоко\", \"Банан\", \"Груша\")\n" +
                                "for (fruit in fruits) {\n" +
                                "    println(fruit) // Вывод: Яблоко, Банан, Груша\n" +
                                "}" + "\nfor (i in 0..10 step 2) {\n" +
                                "    println(i) // Вывод: 0, 2, 4, 6, 8, 10\n" +
                                "}" + "\nfor (i in 5 downTo 1) {\n" +
                                "    println(i) // Вывод: 5, 4, 3, 2, 1\n" +
                                "}"+ "\nУправление циклами: break и continue\n" +
                                "Эти операторы позволяют изменять поведение циклов.\n" +
                                "break: Прерывает выполнение цикла полностью." + "\nfor (i in 1..10) {\n" +
                                "    if (i == 4) break\n" +
                                "    println(i) // Вывод: 1, 2, 3\n" +
                                "}" + "\ncontinue: Пропускает текущую итерацию и переходит к следующей." + "\nfor (i in 1..5) {\n" +
                                "    if (i == 3) continue\n" +
                                "    println(i) // Вывод: 1, 2, 4, 5\n" +
                                "}" + "Диапазоны (Ranges): Kotlin упрощает работу с циклами благодаря диапазонам (.., downTo, step), что делает код компактнее.\n" +
                                "Итерация по коллекциям: Вместо традиционного счётчика часто используются прямые переборы коллекций.\n" +
                                "Функциональный стиль: В Kotlin часто вместо циклов используют функции вроде forEach:" + "\nlistOf(1, 2, 3).forEach { println(it) } // Вывод: 1, 2, 3",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Управление циклами",
                        content = "'break' прерывает выполнение цикла. Пример: for (i in 1..5) { if (i == 3) break }. " +
                                "В ООП используется для управления логикой обработки данных.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Преобразование типов",
                        content = "'toInt()' преобразует строку в число. Пример: \"123\".toInt() вернёт 123. " +
                                "В ООП полезно для работы с данными, полученными от пользователя.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Ветвление в when",
                        content = "'else' в 'when' обрабатывает все случаи, не попавшие под условия. " +
                                "Пример: when (x) { 1 -> \"One\"; else -> \"Other\" }. " +
                                "В ООП помогает описывать поведение объекта для всех возможных состояний.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Массивы",
                        content = "Массивы создаются с помощью 'arrayOf()'. Пример: val arr = arrayOf(1, 2, 3). " +
                                "В ООП массивы используются для хранения наборов данных внутри объектов.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Оператор in",
                        content = "'in' проверяет принадлежность к диапазону или коллекции. " +
                                "Пример: if (5 in 1..10) вернёт true. В ООП удобно для проверки свойств объекта.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Числа с плавающей точкой",
                        content = "'Double' — тип для чисел с плавающей точкой. Пример: val pi: Double = 3.14. " +
                                "В ООП используется для точных вычислений в свойствах объектов.",
                        category = "Основы"
                    ),
                    Theory(
                        title = "Вывод в консоль",
                        content = "'println()' выводит текст в консоль с переносом строки. " +
                                "Пример: println(\"Hello\") выведет Hello. В ООП полезно для отладки состояния объектов.",
                        category = "Основы"
                    )
                )
            )

            // Категория 2: ООП (30 тем)
            addAll(
                listOf(
                    Theory(
                        title = "Наследование классов",
                        content = "Модификатор 'open' в Kotlin позволяет наследовать класс. По умолчанию классы final. " +
                                "Пример: open class A; class B : A(). В ООП наследование передаёт свойства и методы от родителя к потомку. " +
                                "Правильный ответ: open.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Data классы",
                        content = "'data class' предназначен для хранения данных, автоматически предоставляя методы (toString, equals). " +
                                "Пример: data class User(val name: String). В ООП упрощает создание классов для данных. " +
                                "Правильный ответ: Класс для хранения данных.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Инициализация объектов",
                        content = "Блок 'init' вызывается при создании объекта после конструктора. " +
                                "Пример: class A { init { println(\"Создан\") } }. В ООП это часть процесса создания экземпляра. " +
                                "Правильный ответ: init.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Переопределение методов",
                        content = "'override' используется для переопределения метода из суперкласса или интерфейса. " +
                                "Пример: override fun toString() = \"New\". В ООП поддерживает полиморфизм. " +
                                "Правильный ответ: Переопределяет метод.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Интерфейсы с реализацией",
                        content = "В Kotlin интерфейсы могут содержать реализацию методов с версии 1.1. " +
                                "Пример: interface A { fun call() = println(\"Hi\") }. В ООП это расширяет абстракцию. " +
                                "Правильный ответ: Да.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Инкапсуляция",
                        content = "Инкапсуляция скрывает внутреннюю реализацию объекта, предоставляя доступ через методы. " +
                                "Пример: private val x = 5. В ООП защищает данные класса. " +
                                "Правильный ответ: Инкапсуляция.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Переопределение методов",
                        content = "'open' позволяет переопределять методы в подклассах. " +
                                "Пример: open fun run() {}. В ООП это основа для полиморфного поведения. " +
                                "Правильный ответ: open.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Полиморфизм",
                        content = "Полиморфизм — способность объекта принимать разные формы через наследование или интерфейсы. " +
                                "Пример: val x: Animal = Dog(); x.sound(). В ООП обеспечивает гибкость кода. " +
                                "Правильный ответ: Способность объекта иметь несколько форм.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Базовый класс",
                        content = "'Any' — родительский класс для всех классов в Kotlin, аналог Object в Java. " +
                                "Пример: class A : Any(). В ООП формирует корень иерархии. " +
                                "Правильный ответ: Any.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Абстрактные классы",
                        content = "'abstract class' нельзя инстанцировать, он предназначен для наследования. " +
                                "Пример: abstract class Shape. В ООП реализует абстракцию. " +
                                "Правильный ответ: Класс, который нельзя инстанцировать.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Запрет переопределения",
                        content = "'final' запрещает переопределение методов или классов. " +
                                "Пример: final fun go() {}. В ООП ограничивает модификацию поведения. " +
                                "Правильный ответ: final.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Ссылка на суперкласс",
                        content = "'super' обращается к членам родительского класса. " +
                                "Пример: super.toString(). В ООП используется при наследовании. " +
                                "Правильный ответ: Ссылка на родительский класс.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Множественное наследование",
                        content = "В Kotlin класс может наследовать только один класс, но несколько интерфейсов. " +
                                "Пример: class A : B(), I1, I2. В ООП избегает проблем алмазного наследования. " +
                                "Правильный ответ: Нет.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Интерфейсы",
                        content = "Интерфейс в ООП — это контракт, определяющий поведение без реализации (или с ней в Kotlin). " +
                                "Пример: interface Flyable { fun fly() }. " +
                                "Правильный ответ: Контракт поведения.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Синтаксис наследования",
                        content = "Символ ':' используется для наследования классов и интерфейсов. " +
                                "Пример: class B : A(). В ООП связывает иерархию классов. " +
                                "Правильный ответ: :.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Ссылка на объект",
                        content = "'this' указывает на текущий экземпляр класса. " +
                                "Пример: this.name. В ООП используется для доступа к свойствам и методам объекта. " +
                                "Правильный ответ: Ссылка на текущий объект.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Ограничения data class",
                        content = "'data class' не может быть абстрактным, так как предназначен для данных, а не шаблонов. " +
                                "Пример: data class User(val name: String). В ООП это логическое ограничение. " +
                                "Правильный ответ: Нет.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Полиморфизм через интерфейсы",
                        content = "Полиморфизм позволяет использовать один интерфейс для разных реализаций. " +
                                "Пример: val f: Flyable = Bird(); f.fly(). В ООП обеспечивает гибкость. " +
                                "Правильный ответ: Полиморфизм.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Companion object",
                        content = "'companion object' — статическая часть класса для общих членов. " +
                                "Пример: companion object { val x = 5 }. В ООП заменяет static из Java. " +
                                "Правильный ответ: Статическая часть класса.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Инкапсуляция через модификаторы",
                        content = "'private' ограничивает доступ к членам класса, реализуя инкапсуляцию. " +
                                "Пример: private val secret = 42. В ООП защищает данные. " +
                                "Правильный ответ: private.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Sealed классы",
                        content = "'sealed class' ограничивает наследование заданным набором подклассов. " +
                                "Пример: sealed class Result. В ООП полезен для моделирования состояний. " +
                                "Правильный ответ: Ограничивает наследование.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Наследование интерфейсов",
                        content = "Интерфейс может наследовать другой интерфейс. " +
                                "Пример: interface B : A. В ООП расширяет контракты поведения. " +
                                "Правильный ответ: Да.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Делегирование",
                        content = "Делегирование передаёт ответственность за реализацию другому объекту. " +
                                "Пример: class Printer(delegate: Printable) : Printable by delegate. В ООП упрощает повторное использование кода. " +
                                "Правильный ответ: Передача ответственности другому объекту.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Делегирование в интерфейсах",
                        content = "Ключевое слово 'by' используется для делегирования реализации интерфейса. " +
                                "Пример: Printable by delegate. В ООП поддерживает принцип повторного использования. " +
                                "Правильный ответ: by.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Отложенная инициализация",
                        content = "'lateinit' откладывает инициализацию свойства до его использования. " +
                                "Пример: lateinit var name: String. В ООП полезно для не-null свойств, инициализируемых позже. " +
                                "Правильный ответ: Отложенная инициализация свойства.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Доступ к суперклассу",
                        content = "'protected' позволяет подклассам обращаться к членам суперкласса. " +
                                "Пример: protected val x = 5. В ООП регулирует видимость при наследовании. " +
                                "Правильный ответ: protected.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Синглтоны",
                        content = "'object' создаёт синглтон — единственный экземпляр класса. " +
                                "Пример: object Singleton. В ООП используется для глобальных объектов. " +
                                "Правильный ответ: Синглтон.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Совместимость sealed и open",
                        content = "'sealed' и 'open' несовместимы, так как sealed ограничивает наследование, а open открывает его. " +
                                "Пример: sealed class A уже абстрактен. В ООП это логическое ограничение. " +
                                "Правильный ответ: Нет.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Вторичные конструкторы",
                        content = "Вторичный конструктор — дополнительный способ создания объекта. " +
                                "Пример: constructor(name: String) {}. В ООП расширяет гибкость инициализации. " +
                                "Правильный ответ: Дополнительный способ создания объекта.",
                        category = "ООП"
                    ),
                    Theory(
                        title = "Абстракция",
                        content = "'abstract class' реализует принцип абстракции, предоставляя шаблон для подклассов. " +
                                "Пример: abstract class Shape { abstract fun draw() }. В ООП скрывает детали реализации. " +
                                "Правильный ответ: Абстракция.",
                        category = "ООП"
                    )
                )
            )

            // Категория 3: Корутины (30 тем)
            addAll(
                listOf(
                    Theory(
                        title = "Модификатор suspend",
                        content = "'suspend' делает функцию асинхронной, позволяя вызывать её только внутри корутин или других suspend-функций. " +
                                "Пример: suspend fun fetch() = delay(1000). Это основа асинхронного программирования в Kotlin. " +
                                "Правильный ответ: Делает функцию асинхронной.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Глобальный Scope",
                        content = "'GlobalScope' используется для запуска глобальных корутин, не привязанных к жизненному циклу. " +
                                "Пример: GlobalScope.launch { delay(1000) }. Однако рекомендуется избегать его в пользу структурированных областей. " +
                                "Правильный ответ: GlobalScope.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Диспетчер Dispatchers.IO",
                        content = "'Dispatchers.IO' предназначен для задач ввода-вывода, таких как работа с файлами или сетью. " +
                                "Пример: launch(Dispatchers.IO) { readFile() }. Оптимизирует использование потоков для I/O. " +
                                "Правильный ответ: Для ввода-вывода.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Объект Job",
                        content = "'Job' представляет состояние корутины и позволяет управлять её жизненным циклом (запуск, отмена). " +
                                "Пример: val job = launch {}. Не возвращает результат, в отличие от Deferred. " +
                                "Правильный ответ: Состояние корутины.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Отмена корутины",
                        content = "'cancel()' используется для отмены выполнения корутины. " +
                                "Пример: val job = launch {}; job.cancel(). Корутина должна быть кооперативной для отмены. " +
                                "Правильный ответ: cancel().",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Что такое корутина",
                        content = "Корутина в Kotlin — это лёгкий поток, работающий в рамках пула потоков, а не как отдельный поток ОС. " +
                                "Пример: launch { println(\"Hi\") }. Эффективна для асинхронных задач. " +
                                "Правильный ответ: Лёгкий поток.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Доступность suspend",
                        content = "'suspend' ограничивает вызов функции корутинами или другими suspend-функциями. " +
                                "Пример: suspend fun work() {}. Это ключевая часть системы корутин. " +
                                "Правильный ответ: suspend.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Строитель launch",
                        content = "'launch' создаёт и запускает корутину, возвращая Job для управления. " +
                                "Пример: launch { delay(1000) }. Не возвращает результат, используется для побочных эффектов. " +
                                "Правильный ответ: Создаёт и запускает корутину.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Строитель async",
                        content = "'async' запускает корутину и возвращает результат через Deferred. " +
                                "Пример: val deferred = async { 42 }. Подходит для асинхронных вычислений с результатом. " +
                                "Правильный ответ: async.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Deferred",
                        content = "'Deferred' — это объект, содержащий отложенный результат корутины, получаемый через await(). " +
                                "Пример: val d = async { 5 }; d.await(). Расширяет возможности async. " +
                                "Правильный ответ: Отложенный результат корутины.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Ожидание Deferred",
                        content = "'await()' приостанавливает корутину до получения результата Deferred. " +
                                "Пример: val result = async { 10 }.await(). Используется с async. " +
                                "Правильный ответ: await().",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "RunBlocking",
                        content = "'runBlocking' запускает корутину и блокирует текущий поток до её завершения. " +
                                "Пример: runBlocking { delay(1000) }. Полезен для тестов или консольных приложений. " +
                                "Правильный ответ: Запускает корутину и блокирует поток.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Диспетчер Main",
                        content = "'Dispatchers.Main' используется для задач на главном потоке, например, обновления UI. " +
                                "Пример: launch(Dispatchers.Main) { textView.text = \"Hi\" }. Важно для Android-разработки. " +
                                "Правильный ответ: Dispatchers.Main.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "CoroutineScope",
                        content = "'CoroutineScope' — область выполнения корутин, определяющая их жизненный цикл. " +
                                "Пример: CoroutineScope(Dispatchers.Default).launch {}. Связывает корутины с контекстом. " +
                                "Правильный ответ: Область выполнения корутин.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Объединение с родителем",
                        content = "'join()' ждёт завершения корутины, связывая её с родительской. " +
                                "Пример: val job = launch {}; job.join(). Используется для синхронизации. " +
                                "Правильный ответ: join().",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "WithContext",
                        content = "'withContext' переключает диспетчер корутины, возвращая результат. " +
                                "Пример: withContext(Dispatchers.IO) { readFile() }. Удобен для смены контекста. " +
                                "Правильный ответ: Переключает диспетчер корутины.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Диспетчер Default",
                        content = "'Dispatchers.Default' подходит для вычислительных задач, используя пул потоков CPU. " +
                                "Пример: launch(Dispatchers.Default) { compute() }. Оптимизирован для нагрузок. " +
                                "Правильный ответ: Dispatchers.Default.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "SupervisorScope",
                        content = "'supervisorScope' создаёт область, где ошибки дочерних корутин не прерывают родителя. " +
                                "Пример: supervisorScope { launch { throw Exception() } }. Устойчивость к сбоям. " +
                                "Правильный ответ: Область, где ошибки дочерних корутин не влияют на родителя.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Обработка исключений",
                        content = "Исключения в корутинах обрабатываются с помощью 'try-catch'. " +
                                "Пример: try { launch { throw Exception() } } catch (e: Exception) {}. Стандартный подход. " +
                                "Правильный ответ: try-catch.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "CoroutineExceptionHandler",
                        content = "'CoroutineExceptionHandler' — обработчик непойманных исключений в корутинах. " +
                                "Пример: val handler = CoroutineExceptionHandler { _, e -> println(e) }. " +
                                "Правильный ответ: Обработчик исключений для корутин.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Требование Scope",
                        content = "Корутины не могут запускаться без 'Scope', так как он определяет их контекст и жизненный цикл. " +
                                "Пример: CoroutineScope().launch {}. GlobalScope — исключение, но не рекомендуется. " +
                                "Правильный ответ: Нет.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Диспетчер Unconfined",
                        content = "'Dispatchers.Unconfined' запускает корутину без привязки к конкретному потоку. " +
                                "Пример: launch(Dispatchers.Unconfined) {}. Используется редко, для особых случаев. " +
                                "Правильный ответ: Запускает корутину без привязки к потоку.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Приостановка корутины",
                        content = "'delay()' приостанавливает корутину на заданное время, не блокируя поток. " +
                                "Пример: suspend fun wait() { delay(1000) }. Асинхронная альтернатива sleep(). " +
                                "Правильный ответ: delay().",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Результат async",
                        content = "'async' возвращает 'Deferred', содержащий будущий результат корутины. " +
                                "Пример: val deferred = async { 42 }. Используется с await(). " +
                                "Правильный ответ: Deferred.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Контекст по умолчанию",
                        content = "Если диспетчер не указан, корутина наследует контекст родительской корутины. " +
                                "Пример: launch { launch {} } — вложенная использует тот же контекст. " +
                                "Правильный ответ: Контекст родительской корутины.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Функция yield",
                        content = "'yield()' уступает выполнение другим корутинам, помогая кооперативной многозадачности. " +
                                "Пример: launch { yield() }. Улучшает отзывчивость. " +
                                "Правильный ответ: Уступает выполнение другим корутинам.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Результат launch",
                        content = "'launch' не возвращает результат, только Job для управления корутиной. " +
                                "Пример: launch { println(\"Hi\") }. Для результата нужен async. " +
                                "Правильный ответ: Нет.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "CoroutineContext",
                        content = "'coroutineContext' — набор элементов (диспетчер, Job), определяющих поведение корутины. " +
                                "Пример: coroutineContext[Job]. Влияет на выполнение. " +
                                "Правильный ответ: Набор элементов, определяющих поведение корутины.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Тестирование корутин",
                        content = "'runBlocking' используется для тестирования корутин, блокируя поток до завершения. " +
                                "Пример: runBlocking { testCoroutine() }. Удобен в тестах. " +
                                "Правильный ответ: runBlocking.",
                        category = "Корутины"
                    ),
                    Theory(
                        title = "Состояние активности",
                        content = "'isActive' проверяет, активна ли корутина (не отменена и не завершена). " +
                                "Пример: if (isActive) { println(\"Работает\") }. Полезно для кооперативной отмены. " +
                                "Правильный ответ: Проверяет, активна ли корутина.",
                        category = "Корутины"
                    )

                )
            )

            // Категория 4: Коллекции (30 тем)
            addAll(
                listOf(
                    Theory(
                        title = "Неизменяемые коллекции",
                        content = "В Kotlin 'List' по умолчанию неизменяем, создаётся через listOf(). " +
                                "Пример: val list = listOf(1, 2, 3) нельзя изменить. Это обеспечивает безопасность данных. " +
                                "Правильный ответ: List.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Функция map",
                        content = "'map' преобразует каждый элемент списка по заданной функции, возвращая новый список. " +
                                "Пример: listOf(1, 2).map { it * 2 } вернёт [2, 4]. Используется для трансформации данных. " +
                                "Правильный ответ: Преобразует элементы.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Создание пустого списка",
                        content = "'emptyList()' создаёт пустой неизменяемый список с типом по умолчанию. " +
                                "Пример: val list: List<Int> = emptyList(). Эффективнее, чем listOf(). " +
                                "Правильный ответ: emptyList().",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Функция filter",
                        content = "'filter' отбирает элементы коллекции, удовлетворяющие условию, возвращая новый список. " +
                                "Пример: listOf(1, 2, 3).filter { it > 1 } вернёт [2, 3]. Полезно для выборки данных. " +
                                "Правильный ответ: Фильтрует по условию.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Уникальность элементов",
                        content = "'Set' — коллекция, не допускающая дубликатов, основана на хэшировании или порядке. " +
                                "Пример: setOf(1, 1, 2) вернёт {1, 2}. Идеальна для уникальных наборов. " +
                                "Правильный ответ: Set.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Изменяемые списки",
                        content = "'mutableListOf()' создаёт изменяемый список, в который можно добавлять элементы. " +
                                "Пример: val list = mutableListOf(1); list.add(2). В отличие от listOf(). " +
                                "Правильный ответ: Создаёт изменяемый список.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Доступ к элементам Map",
                        content = "'get()' возвращает значение по ключу в Map или null, если ключа нет. " +
                                "Пример: mapOf(\"a\" to 1).get(\"a\") вернёт 1. Альтернатива — квадратные скобки. " +
                                "Правильный ответ: get().",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Функция forEach",
                        content = "'forEach' применяет действие к каждому элементу коллекции, не возвращая результат. " +
                                "Пример: listOf(1, 2).forEach { println(it) }. Удобно для итераций. " +
                                "Правильный ответ: Применяет действие к каждому элементу.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Сортировка списка",
                        content = "'sorted()' возвращает новый отсортированный список, не изменяя исходный. " +
                                "Пример: listOf(3, 1).sorted() вернёт [1, 3]. В отличие от sort() для изменяемых списков. " +
                                "Правильный ответ: sorted().",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Преобразование в Set",
                        content = "'toSet()' преобразует список в множество, удаляя дубликаты. " +
                                "Пример: listOf(1, 1, 2).toSet() вернёт {1, 2}. Полезно для уникальности. " +
                                "Правильный ответ: Множество без дубликатов.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Добавление в MutableList",
                        content = "'add()' добавляет элемент в изменяемый список. " +
                                "Пример: val list = mutableListOf(1); list.add(2). Основной метод для списков. " +
                                "Правильный ответ: add().",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Удаление дубликатов",
                        content = "'distinct()' возвращает список без дубликатов, сохраняя порядок. " +
                                "Пример: listOf(1, 1, 2).distinct() вернёт [1, 2]. Альтернатива toSet(). " +
                                "Правильный ответ: Удаляет дубликаты.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Упорядоченные коллекции",
                        content = "'List' упорядочен по умолчанию, сохраняя последовательность элементов. " +
                                "Пример: listOf(1, 2) сохранит порядок. В отличие от Set. " +
                                "Правильный ответ: List.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Группировка элементов",
                        content = "'groupBy()' группирует элементы коллекции по ключу, возвращая Map. " +
                                "Пример: listOf(\"a\", \"b\").groupBy { it } вернёт {\"a\" to [\"a\"], \"b\" to [\"b\"]}. " +
                                "Правильный ответ: Группирует элементы по ключу.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Проверка пустоты",
                        content = "'isEmpty()' возвращает true, если коллекция пуста. " +
                                "Пример: listOf<Int>().isEmpty() вернёт true. Стандартный способ проверки. " +
                                "Правильный ответ: isEmpty().",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Первый элемент",
                        content = "'first()' возвращает первый элемент коллекции или бросает исключение, если пусто. " +
                                "Пример: listOf(1, 2).first() вернёт 1. Удобно для доступа. " +
                                "Правильный ответ: Первый элемент.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Объединение коллекций",
                        content = "'plus()' объединяет две коллекции в новый список. " +
                                "Пример: listOf(1) + listOf(2) вернёт [1, 2]. Альтернатива — оператор '+'. " +
                                "Правильный ответ: plus().",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Функция any",
                        content = "'any()' проверяет, есть ли хотя бы один элемент, удовлетворяющий условию. " +
                                "Пример: listOf(1, 2).any { it > 1 } вернёт true. Полезно для условий. " +
                                "Правильный ответ: Проверяет, есть ли элемент, удовлетворяющий условию.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Создание неизменяемого множества",
                        content = "'setOf()' создаёт неизменяемое множество. " +
                                "Пример: setOf(1, 2) создаёт {1, 2}. В отличие от mutableSetOf(). " +
                                "Правильный ответ: setOf().",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Функция flatMap",
                        content = "'flatMap()' преобразует элементы и сглаживает вложенные коллекции в одну. " +
                                "Пример: listOf(listOf(1), listOf(2)).flatMap { it } вернёт [1, 2]. " +
                                "Правильный ответ: Преобразует и сглаживает коллекцию.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Удаление из MutableSet",
                        content = "'remove()' удаляет элемент из изменяемого множества. " +
                                "Пример: val set = mutableSetOf(1); set.remove(1). Основной метод удаления. " +
                                "Правильный ответ: remove().",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Функция zip",
                        content = "'zip()' создаёт пары из элементов двух коллекций. " +
                                "Пример: listOf(1, 2).zip(listOf(\"a\", \"b\")) вернёт [(1, \"a\"), (2, \"b\")]. " +
                                "Правильный ответ: Создаёт пары из элементов.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Функция take",
                        content = "'take(n)' возвращает первые n элементов коллекции. " +
                                "Пример: listOf(1, 2, 3).take(2) вернёт [1, 2]. Удобно для выборки. " +
                                "Правильный ответ: Первые n элементов.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Проверка наличия",
                        content = "'contains()' проверяет, есть ли элемент в коллекции. " +
                                "Пример: listOf(1, 2).contains(1) вернёт true. Стандартная проверка. " +
                                "Правильный ответ: contains().",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Функция reduce",
                        content = "'reduce()' сворачивает коллекцию в одно значение, применяя операцию. " +
                                "Пример: listOf(1, 2, 3).reduce { a, b -> a + b } вернёт 6. Для агрегации данных. " +
                                "Правильный ответ: Сворачивает коллекцию в одно значение.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Коллекция для поиска по ключу",
                        content = "'Map' обеспечивает быстрый поиск по ключу благодаря хэшированию. " +
                                "Пример: mapOf(\"a\" to 1)[\"a\"] вернёт 1. Лучше, чем List или Set. " +
                                "Правильный ответ: Map.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Функция drop",
                        content = "'drop(n)' удаляет первые n элементов, возвращая остаток. " +
                                "Пример: listOf(1, 2, 3).drop(1) вернёт [2, 3]. Противоположно take(). " +
                                "Правильный ответ: Удаляет первые n элементов.",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Создание неизменяемой карты",
                        content = "'mapOf()' создаёт неизменяемую карту ключ-значение. " +
                                "Пример: mapOf(\"a\" to 1). В отличие от mutableMapOf(). " +
                                "Правильный ответ: mapOf().",
                        category = "Коллекции"
                    ),
                    Theory(
                        title = "Функция all",
                        content = "'all()' проверяет, удовлетворяют ли все элементы условию. " +
                                "Пример: listOf(1, 2).all { it > 0 } вернёт true. Противоположно any(). " +
                                "Правильный ответ: Проверяет, все ли элементы удовлетворяют условию.",
                        category = "Коллекции"
                    )
                )
            )
        }
        dao.insertQuestions(questions)
        dao.insertTheory(theory)
    }
}
