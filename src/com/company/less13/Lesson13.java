package com.company.less13;

import java.io.*;

public class Lesson13 {

    public static void main(String[] args) {
        System.out.println("Finished");
        Values values = null;
        try {
            values = parseResponse("Value1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(values);
//        ioStreams();
        fileReaderAndWriter();
//        bufferedWriterUsage();
//        bufferedReaderUsage();
//        files();
        serialization();
        deserialization();
    }

    private static Values parseResponse(String value) throws Exception {
        Values values;
        switch (value) {
            case "Value1":
                values = Values.VALUE_1;
                break;
            case "Value2":
                values = Values.VALUE_2;
                break;
            default:
                throw new Exception("Cannot parse with:" + value);
        }
        return values;
    }

    enum Values {
        VALUE_1, VALUE_2
    }

    private static void ioStreams() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("Hello.txt");
            fileOutputStream = new FileOutputStream("copied.txt", true);

            int a;
            while ((a = fileInputStream.read()) != -1) {
                fileOutputStream.write(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }

    private static void fileReaderAndWriter() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("Hello.txt");
            fileWriter = new FileWriter("copied.txt");
            StringBuilder str = new StringBuilder();
            int a;
            while ((a = fileReader.read()) != -1) {
                fileWriter.write(a);
                str.append((char) a);
            }
            System.out.println("******" + str);
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }

    private static void bufferedWriterUsage() {
        String dirName = "java/Programming/newDir";
        File file = new File(dirName);
        file.mkdirs();
        String osIndependentPathName = "java" + File.separator + "Programming" + File.separator + "newDir" + File.separator + "test.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(osIndependentPathName))) {
            String text = "Hello world!\nWe are learning Java!";
            bufferedWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bufferedReaderUsage() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("notes.txt"))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void files() {
        String separator = File.separator;
        String osIndependentPathName = "java" + separator + "Programming" + separator + "newDir";
        String dirName = "java/Programming/ewDir";
        System.out.println(dirName);
        System.out.println(osIndependentPathName);
        File file = new File(osIndependentPathName);

        System.out.println(file.mkdirs());
        System.out.println("Path: " + file.getPath());
        try {
            System.out.println(new File("newDir").createNewFile());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println(file.getAbsoluteFile());
        try {
            System.out.println(file.getCanonicalPath());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        String[] pathes = new File("java").list();
        if (pathes != null) {
            for (String str : pathes) {
                System.out.println(str);
            }
        }
        String[] strings = {"av", "ab", "aq"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        for (String s : strings) {
            System.out.println(s);
        }
    }

    private static void serialization() {
        Person person = new Person("Nick", 34, true);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserialization() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person person = (Person) ois.readObject();
            System.out.println(person.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
