import java.io.*;

class Prem10 {
    public static void main(String[] args) throws IOException

    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter id: ");
        int id = Integer.parseInt(br.readLine());

        System.out.println("Enter salary: ");
        float sal = Float.parseFloat(br.readLine());

        System.out.println("Enter name: ");
        String name = br.readLine();

        System.out.println("Enter sex: ");
        char sex = (char) br.read();

        System.out.println("Id = " + id);
        System.out.println("Sex = " + sex);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + sal);
    }
}