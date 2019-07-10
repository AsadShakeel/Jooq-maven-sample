import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;

import static models.Tables.*;

public class Main {

    public static void main(String[] args){
        String userName = "postgres";
        String password = "postgres";
        String url = "jdbc:postgresql://localhost:5432/postgres";

        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext context = DSL.using(conn, SQLDialect.POSTGRES);

            context.insertInto(SAMPLE, SAMPLE.ID, SAMPLE.TEMP).values(3, "temp3").execute();

            Result<Record> result = context.select().from(SAMPLE).fetch();
            for (Record record : result){
                Integer id = record.getValue(SAMPLE.ID);
                String temp = record.getValue(SAMPLE.TEMP);

                System.out.println(id + " " + temp);
            }
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

