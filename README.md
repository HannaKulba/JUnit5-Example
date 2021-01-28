# Тестовый проект, демонстрирующий возможности JUnit5

## Автор

[Anna Kulba](https://github.com/HannaKulba)

## Версия JDK
```
1.8
```

## Версия Java
```
Java 8
```

## Версия Gradle
```
6.2.2
```

## Запуск тестов

### Запуск всех тестов
```
gradle clean test
```
### Запуск тестов класса
```
gradle clean test --tests eu.senla.junit5.examples.package1.TestAnnotations
```
### Запуск тестовых методов
```
gradle clean test --tests eu.senla.junit5.examples.package1.TestAnnotations.succeedingTest
```