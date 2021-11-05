package lesson9;

public class Utilities {

    public static class Delete {

        public static void delete(String filename) {
            System.out.println("Delete something");
        }
    }


    public static class Create {

        public static void createFile() {
            System.out.println("Create file");
        }
    }
}

    class AnotherMainApplication {
        public static void main(String[] args) {
            Utilities.Create.createFile();

        }
    }

