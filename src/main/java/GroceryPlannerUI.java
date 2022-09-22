import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GroceryPlannerUI {
    Repository repository = new Repository();

    public void createUI() {
        JFrame frame = new JFrame("GROCERY PLANNER");
        JLabel label1, label2, label3, label4, label5, label6, label7;

        ArrayList<String> foodNames = repository.getFoodNames();

        String[] food = foodNames.stream().toArray(String[]::new);

        label1 = new JLabel("Sunday");
        label2 = new JLabel("Monday");
        label3 = new JLabel("Tuesday");
        label4 = new JLabel("Wednesday");
        label5 = new JLabel("Thursday");
        label6 = new JLabel("Friday");
        label7 = new JLabel("Saturday");

        label1.setBounds(50, 50, 100, 20);
        label2.setBounds(50, 150, 100, 20);
        label3.setBounds(50, 250, 100, 20);
        label4.setBounds(50, 350, 100, 20);
        label5.setBounds(50, 450, 100, 20);
        label6.setBounds(50, 550, 100, 20);
        label7.setBounds(50, 650, 100, 20);


        JComboBox comboBox1 = new JComboBox(food);
        JComboBox comboBox2 = new JComboBox(food);
        JComboBox comboBox3 = new JComboBox(food);
        JComboBox comboBox4 = new JComboBox(food);
        JComboBox comboBox5 = new JComboBox(food);
        JComboBox comboBox6 = new JComboBox(food);
        JComboBox comboBox7 = new JComboBox(food);
        JComboBox comboBox8 = new JComboBox(food);
        JComboBox comboBox9 = new JComboBox(food);
        JComboBox comboBox10 = new JComboBox(food);
        JComboBox comboBox11 = new JComboBox(food);
        JComboBox comboBox12 = new JComboBox(food);
        JComboBox comboBox13 = new JComboBox(food);
        JComboBox comboBox14 = new JComboBox(food);
        JComboBox comboBox15 = new JComboBox(food);
        JComboBox comboBox16 = new JComboBox(food);
        JComboBox comboBox17 = new JComboBox(food);
        JComboBox comboBox18 = new JComboBox(food);
        JComboBox comboBox19 = new JComboBox(food);
        JComboBox comboBox20 = new JComboBox(food);
        JComboBox comboBox21 = new JComboBox(food);


        comboBox1.setBounds(250, 50, 150, 20);
        comboBox2.setBounds(500, 50, 150, 20);
        comboBox3.setBounds(750, 50, 150, 20);
        comboBox4.setBounds(250, 150, 150, 20);
        comboBox5.setBounds(500, 150, 150, 20);
        comboBox6.setBounds(750, 150, 150, 20);
        comboBox7.setBounds(250, 250, 150, 20);
        comboBox8.setBounds(500, 250, 150, 20);
        comboBox9.setBounds(750, 250, 150, 20);
        comboBox10.setBounds(250, 350, 150, 20);
        comboBox11.setBounds(500, 350, 150, 20);
        comboBox12.setBounds(750, 350, 150, 20);
        comboBox13.setBounds(250, 450, 150, 20);
        comboBox14.setBounds(500, 450, 150, 20);
        comboBox15.setBounds(750, 450, 150, 20);
        comboBox16.setBounds(250, 550, 150, 20);
        comboBox17.setBounds(500, 550, 150, 20);
        comboBox18.setBounds(750, 550, 150, 20);
        comboBox19.setBounds(250, 650, 150, 20);
        comboBox20.setBounds(500, 650, 150, 20);
        comboBox21.setBounds(750, 650, 150, 20);

        JButton button1 = new JButton("Generate");
        button1.setBounds(500, 750, 150, 40);
        button1.setBackground(Color.DARK_GRAY);
        button1.setForeground(Color.BLUE);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String item1 = (String) comboBox1.getItemAt(comboBox1.getSelectedIndex());
                String item2 = (String) comboBox2.getItemAt(comboBox2.getSelectedIndex());
                String item3 = (String) comboBox3.getItemAt(comboBox3.getSelectedIndex());
                String item4 = (String) comboBox4.getItemAt(comboBox4.getSelectedIndex());
                String item5 = (String) comboBox5.getItemAt(comboBox5.getSelectedIndex());
                String item6 = (String) comboBox6.getItemAt(comboBox6.getSelectedIndex());
                String item7 = (String) comboBox7.getItemAt(comboBox7.getSelectedIndex());
                String item8 = (String) comboBox8.getItemAt(comboBox8.getSelectedIndex());
                String item9 = (String) comboBox9.getItemAt(comboBox9.getSelectedIndex());
                String item10 = (String) comboBox10.getItemAt(comboBox10.getSelectedIndex());
                String item11 = (String) comboBox11.getItemAt(comboBox11.getSelectedIndex());
                String item12 = (String) comboBox12.getItemAt(comboBox12.getSelectedIndex());
                String item13 = (String) comboBox13.getItemAt(comboBox13.getSelectedIndex());
                String item14 = (String) comboBox14.getItemAt(comboBox14.getSelectedIndex());
                String item15 = (String) comboBox15.getItemAt(comboBox15.getSelectedIndex());
                String item16 = (String) comboBox16.getItemAt(comboBox16.getSelectedIndex());
                String item17 = (String) comboBox17.getItemAt(comboBox17.getSelectedIndex());
                String item18 = (String) comboBox18.getItemAt(comboBox18.getSelectedIndex());
                String item19 = (String) comboBox19.getItemAt(comboBox19.getSelectedIndex());
                String item20 = (String) comboBox20.getItemAt(comboBox20.getSelectedIndex());
                String item21 = (String) comboBox21.getItemAt(comboBox21.getSelectedIndex());

                ArrayList<String> itemList = new ArrayList<>();
                itemList.add(item1);
                itemList.add(item2);
                itemList.add(item3);
                itemList.add(item4);
                itemList.add(item5);
                itemList.add(item6);
                itemList.add(item7);
                itemList.add(item8);
                itemList.add(item9);
                itemList.add(item10);
                itemList.add(item11);
                itemList.add(item12);
                itemList.add(item13);
                itemList.add(item14);
                itemList.add(item15);
                itemList.add(item16);
                itemList.add(item17);
                itemList.add(item18);
                itemList.add(item19);
                itemList.add(item20);
                itemList.add(item21);

                displayGroceryPlanner(itemList);
            }
        });

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);

        frame.add(button1);

        frame.add(comboBox1);
        frame.add(comboBox2);
        frame.add(comboBox3);
        frame.add(comboBox4);
        frame.add(comboBox5);
        frame.add(comboBox6);
        frame.add(comboBox7);
        frame.add(comboBox8);
        frame.add(comboBox9);
        frame.add(comboBox10);
        frame.add(comboBox11);
        frame.add(comboBox12);
        frame.add(comboBox13);
        frame.add(comboBox14);
        frame.add(comboBox15);
        frame.add(comboBox16);
        frame.add(comboBox17);
        frame.add(comboBox18);
        frame.add(comboBox19);
        frame.add(comboBox20);
        frame.add(comboBox21);


        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void displayGroceryPlanner(ArrayList<String> itemList) {
        JFrame f;
        JTable j;
        f = new JFrame();
        f.setTitle("Grocery List");
        //String data[][]={ {"101","Amit","670000"},
        //        {"102","Jai","780000"},
        //       {"101","Sachin","700000"}};
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        for (int i = 0; i < itemList.size(); i++) {
            ingredients.addAll(repository.getIngredients(itemList.get(i)));
        }

        HashMap<String, Ingredient> resultMap = new HashMap<>();
        for (int i = 0; i < ingredients.size(); i++) {
            Ingredient newIngredient = ingredients.get(i);
            if (resultMap.get(newIngredient.getName()) == null) {
                resultMap.put(newIngredient.getName(), newIngredient);
            } else {
                Ingredient existingIngredient = resultMap.get(newIngredient.getName());
                int newQuantity = existingIngredient.getQuantity() + newIngredient.getQuantity();
                existingIngredient.setQuantity(newQuantity);
            }
        }

        String data[][] = new String[100][100];

        int i = 0;
        for (HashMap.Entry<String,Ingredient> entry : resultMap.entrySet()){
            data[i][0] = entry.getValue().getName();
            data[i][1] = String.valueOf(entry.getValue().getQuantity());
            data[i][2] = entry.getValue().getMeasuremnt();
            i++;
        }

        // Column Names
        String[] columnNames = {"Name", "Quantity", "Measurement"};

        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }
}


