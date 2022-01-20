package com.example.functioninterfaceandliambda.functional_liambda.choseWithFunctionalWithoutArgs;

import com.example.functioninterfaceandliambda.functional_liambda.manyArgsOrNoArgs.NoArgsFunction;

public class ChoseWithLiambda {

    protected static class Person {

        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    protected static class DataLoader {
        public final NoArgsFunction< Person> loadPerson; //ничего не принемает, новозвращает Person

        public DataLoader(Boolean isDevelopProfiled) {
            loadPerson = isDevelopProfiled ? this::loadFakePerson : this::loadRealPerson;
        }

        private Person loadRealPerson() {
            System.out.println(" Loading Person...");
            return new Person("realPers", 35);
        }

        private Person loadFakePerson() {
            System.out.println("Returning fake Person...");
            return new Person("FakePerson", 100);
        }
    }

    public static void main(String[] args) {
     Boolean isDevelopProfiled = false;
     DataLoader dataLoader = new DataLoader(isDevelopProfiled);
        Person apply = dataLoader.loadPerson.apply();
        System.out.println(apply);
    }
}
