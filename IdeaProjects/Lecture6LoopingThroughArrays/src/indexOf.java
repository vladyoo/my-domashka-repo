public class indexOf {

    public static void main(String[] args) {

        String str = "Hello, World";

        int indexOfW = str.indexOf('W');
        if (indexOfW < 0)    {                          // можно проверить если буква такая не найдётся он нам вернёт минус единицу
            System.out.println("No such letter");       // то есть любой отрицательный индекс будет означать, такой символ не найден
        }  else {
            System.out.println(str.substring(indexOfW));  // подстроку начиная с этого индекса и до самого конца

        }





//        System.out.println(str.substring(str.indexOf('W')));    // этот вариант в одну строку / в этом случае выйдет "World"



    }
}


/*
метод "indexOf" он нам возвращает индекс, позицию в строке. Первую позицию в строке, на которое мы скажем
indexOf('W') и она нам вернет индекс с 'W' и после этого мы можем взять этот индекс и
сделать подстроку "substring" начиная с этого индекса 'W'


 */

