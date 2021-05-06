package math.problems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class PrimeNumber {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use MySql Database to store data and retrieve data.
         *
         */
        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i <= 1000000; i++) {
            if (isPrimeNumber(i)) {
                primes.add(i);
                System.out.print("-");
            }
        }
        System.out.println("");
        System.out.println("List of Primes  in the range of 2 to 1,000,000 ");
        primes.forEach(name -> {
            System.out.print(name + ", ");
        });
        System.out.println("");
        System.out.println("Number of primes  in the range of 2 to 1,000,000 are :" + primes.size());


        // saving primes to MySql
        String username = "root";
        String password = "root1234";
        String dbName = "midtermmath";


        String url = "jdbc:mysql://localhost:3306/" + dbName + "";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

    }

    public static boolean isPrimeNumber(int n) {

        // Check if number is 2
        if (n == 2)
            return true;

            // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;

        // check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;


    }

}
