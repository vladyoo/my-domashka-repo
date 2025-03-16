public class subString {

    public static void main(String[] args) {

        String str = "Hello, world!";
        System.out.println(str.substring(7));                 // распечатает все символы начинающие с 7-го элемента
        System.out.println(str.substring(0, 5));                         // 5 chars(элементов) from beginning (последний индекс "5" не включается)
        System.out.println(str.substring(str.length() - 3));   // 3 last chars from ending (все элементы включительно)
        System.out.println(str.charAt(5));                               // какой стоит символ на индексе "5" считать начинаем с "0"
                                                                         // в основа строки лежит массив элементов(chars)

        System.out.println(str.equals("xxxx"));                          // можно сравнивать строки, что они являются они одинаковыми
                                                                         // в этом случае будет "false"
        System.out.println(str.equals("Hello, world!"));                 // "true"
        System.out.println(str.equalsIgnoreCase("HEllo, world!")); // также будет равняться "0" не взирая на то что строки выглядят по разному

        System.out.println(str.compareTo("H"));                       // в этом методе можно узнать какая из строк будет первая работать
        System.out.println(str.compareTo("Hello, world!"));                // в этом случае будет равняться "0"
        System.out.println(str.compareToIgnoreCase("HEllo, world!"));  // также будет равняться "0" не взирая на то что строки выглядят по разному

        System.out.println(str.toUpperCase());                            // распечатает все символы с большими буквами
        System.out.println(str.toLowerCase());                            // распечатает все символы с маленькими буквами


        System.out.println(str.contains("orl"));                            // входят ли эти символы в строку "Hello, world!"   /true
        System.out.println(str.contains("xxx"));                            // входят ли эти символы в строку "Hello, world!"   /false
        System.out.println(str.startsWith("H"));                            //                                                   /true
        System.out.println(str.endsWith("H!"));                            //                                                     /false

        System.out.println(str.toLowerCase().contains("ORL".toLowerCase()));  //  мы приводим обе строки исходную и ту которую мы внутри ищем
                                                                              // к одному и тому же регистру в данном случае "LowerCase" и ищем
                                                                              // метод "contains" запускается уже не на оригинальной строке а на её копии
                                                                              // где каждый символ заменён таким же символом но в нижнем регистре






    }
}



/*
Методы - это некие функции (кусок кода), который принадлежит каждый конкретному экземпляру,
объекту, каждой штуки в Java (в Джаве это всё классы и объекты)

== сравнение равенства работает только для примитивных типов, а всё что с большой буквы уже нет
(например String и т.д. и также массивы). В этом случае будет работать метод "equals"


важно учесть, если при методе сортирования строк идёт в первую очередь с больших букв от "A" to "Z"
а затем идут маленькие буквы от "a" to "z"
 */