package com.javarush.task.task33.task3310.strategy;

import org.apache.commons.collections4.bidimap.DualHashBidiMap;

public class DualHashBidiMapStorageStrategy implements StorageStrategy {

    private final DualHashBidiMap<Long,String> data = new DualHashBidiMap();

    @Override
    public boolean containsKey(Long key) {
        return data.containsKey(key);
    }

    @Override
    public boolean containsValue(String value) {
        return data.containsValue(value);
    }

    @Override
    public void put(Long key, String value) {
        data.put(key,value);
    }

    @Override
    public Long getKey(String value) {
        return data.getKey(value);
    }

    @Override
    public String getValue(Long key) {
        return data.get(key);
    }
}

/*
Shortener (13)
Рассмотрим еще одну реализацию BiMap, на этот раз из Apache Commons Collections.
13.1. Скачай и подключи Apache Commons Collections 4.0.
13.2. Реализуй стратегию DualHashBidiMapStorageStrategy. Она должна:
13.2.1. Поддерживать интерфейс StorageStrategy.
13.2.2. Внутри иметь только одно поле data с типом DualHashBidiMap.
13.3. Проверь новую стратегию в методе main(). Запусти программу и сравни скорость работы шести стратегий.


Требования:
1. Класс DualHashBidiMapStorageStrategy должен поддерживать интерфейс StorageStrategy.
2. В классе DualHashBidiMapStorageStrategy должно быть создано только одно поле data типа DualHashBidiMap.
3. Метод containsKey() должен проверять содержится ли ключ в data.
4. Метод containsValue() должен проверять содержится ли значение в data.
5. Метод put() должен добавлять пару (key, value) в data.
6. Метод getValue() должен возвращать значение полученное из data.
7. Метод getKey() должен возвращать ключ полученный из data.getKey().
 */