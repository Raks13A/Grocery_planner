import java.sql.*;

import java.util.ArrayList;

public class Repository {
    public ArrayList<String> getFoodNames(){
        String items = null;
        Connection connection = null;
        ArrayList<String> foodList= new ArrayList<>();
        try {
            String query = "select * from items ";
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "rraaevhv1309*");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next() == true) {
                items = resultSet.getString("dish_name");
                foodList.add(items);
            }
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return foodList;
    }
    public ArrayList<Ingredient> getIngredients(String item){
        Connection connection = null;
        ArrayList<Ingredient> ingredientList= new ArrayList<>();

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "rraaevhv1309*");
            PreparedStatement query;
            query =connection.prepareStatement( "select name,quantity,measurement\n" +
                    "from ingredients\n" +
                    "where item_id=(select id from  items\n" +
                    "where dish_name=?)");
            query.setString(1,item);
            Class.forName("org.postgresql.Driver");
            ResultSet resultSet = query.executeQuery();
            while (resultSet.next() == true) {
                Ingredient ingredient=new Ingredient();
                ingredient.setName(resultSet.getString("name"));
                ingredient.setQuantity(resultSet.getInt("quantity"));
                ingredient.setMeasuremnt(resultSet.getString("measurement"));
                ingredientList.add(ingredient);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return ingredientList;
    }
}


