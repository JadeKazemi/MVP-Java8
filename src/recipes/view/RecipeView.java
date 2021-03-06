package recipes.view;

import recipes.presenter.RecipePresenter;
import java.util.List;

public class RecipeView extends javax.swing.JFrame implements IView {
    
    // presenter for this view
    private RecipePresenter recipePresenter;
    
    public RecipeView(RecipePresenter rp) {
        recipePresenter = rp; 
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitButton = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        mainIngredientLabel = new javax.swing.JLabel();
        preparationTimeLabel = new javax.swing.JLabel();
        categoryTextField = new javax.swing.JTextField();
        preparationTimeTextField2 = new javax.swing.JTextField();
        mainIngredientTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        inputLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        outputLabel = new javax.swing.JLabel();
        cookingTimeLabel = new javax.swing.JLabel();
        preparationTimeTextField1 = new javax.swing.JTextField();
        cookingTimeTextField1 = new javax.swing.JTextField();
        cookingTimeTextField2 = new javax.swing.JTextField();
        queryLabel = new javax.swing.JLabel();
        CombinedCookingTimeLabel = new javax.swing.JLabel();
        combinedTimeTextField1 = new javax.swing.JTextField();
        combinedTimeTextField2 = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        categoryAndPreparationTimeButton = new javax.swing.JButton();
        categoryButton = new javax.swing.JButton();
        categoryAndCobinedTimeButton = new javax.swing.JButton();
        mainIngredientButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurant Booking System");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Name");

        categoryLabel.setText("Category");

        mainIngredientLabel.setText("Main Ingredient");

        preparationTimeLabel.setText("Preparation Time");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        inputLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        inputLabel.setText("Input");

        outputTextArea.setColumns(20);
        outputTextArea.setRows(5);
        jScrollPane1.setViewportView(outputTextArea);

        outputLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        outputLabel.setText("Output");

        cookingTimeLabel.setText("Cooking Time");

        queryLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        queryLabel.setText("Select recipes for the following attributes:");

        CombinedCookingTimeLabel.setText("Combined Time");

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        categoryAndPreparationTimeButton.setText("Category and Preparation Time");
        categoryAndPreparationTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryAndPreparationTimeButtonActionPerformed(evt);
            }
        });

        categoryButton.setText("Category");
        categoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryButtonActionPerformed(evt);
            }
        });

        categoryAndCobinedTimeButton.setText("Category and Combined Time");
        categoryAndCobinedTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryAndCobinedTimeButtonActionPerformed(evt);
            }
        });

        mainIngredientButton.setText("Main Ingredient");
        mainIngredientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainIngredientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryButton)
                    .addComponent(categoryAndPreparationTimeButton)
                    .addComponent(categoryAndCobinedTimeButton)
                    .addComponent(mainIngredientButton))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(categoryButton)
                .addGap(18, 18, 18)
                .addComponent(categoryAndPreparationTimeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(categoryAndCobinedTimeButton)
                .addGap(18, 18, 18)
                .addComponent(mainIngredientButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryLabel)
                            .addComponent(mainIngredientLabel)
                            .addComponent(preparationTimeLabel)
                            .addComponent(cookingTimeLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nameLabel)
                                .addComponent(inputLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cookingTimeTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                        .addComponent(preparationTimeTextField1))
                                    .addComponent(combinedTimeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(categoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(preparationTimeTextField2)
                                    .addComponent(cookingTimeTextField2)
                                    .addComponent(mainIngredientTextField)
                                    .addComponent(combinedTimeTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(queryLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CombinedCookingTimeLabel)
                                        .addGap(67, 67, 67)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(outputLabel)
                            .addGap(182, 182, 182))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearButton, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(exitButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputLabel)
                    .addComponent(inputLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryLabel)
                            .addComponent(categoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(preparationTimeLabel)
                                .addComponent(preparationTimeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(preparationTimeTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cookingTimeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cookingTimeTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cookingTimeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CombinedCookingTimeLabel)
                            .addComponent(combinedTimeTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combinedTimeTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mainIngredientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainIngredientLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(queryLabel)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addGap(38, 38, 38)
                        .addComponent(clearButton)
                        .addGap(39, 39, 39)
                        .addComponent(exitButton)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        recipePresenter.close();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void categoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryButtonActionPerformed
        String catTxt = catTxtField.getText();   
        if ( catTxt.equals("") ) {
            outputTextArea.setText("Please insert a category.\n"); 
            return;
        }
        recipePresenter.recCat(catTxt);
    }//GEN-LAST:event_categoryButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String ntf = nameTxtField.getText();
        String ctf = catTxtField.getText();
        String pttf = perpTimeTxtFieldFirst.getText();
        String cttf = cookTimeTxtFieldFirst.getText(); 
        String mitf = mainIngrTxtField.getText();
        if (    ntf.equals( "" ) || 
                ctf.equals( "" ) ||
                mitf.equals( "" ) ||
                pttf.equals( "" ) ||
                cttf.equals( "" )
            ) {
            outputTxtArea.setText( "All database fields must be specified\n" ); 
            return;            
        }
        
        int pt = Integer.parseInt( pttf );
        int ct = Integer.parseInt( cttf );

        recipePresenter.newRecipe( ntf, ctf, mitf, pt, ct );         
    }//GEN-LAST:event_addButtonActionPerformed

    private void categoryAndPreparationTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryAndPreparationTimeButtonActionPerformed
        String catTxt = catTxtField.getText();
        String prepTimeF = perpTimeTxtFieldFirst.getText();
        String prepTimeS = prepTimeTxtFieldSec.getText();
        if (catTxt.equals( "" )){
            outputTxtArea.setText("Please insert a category\n"); 
            return;  
        }   
        int firstInp;
        int secInp;
        if (prepTimeF.equals("") && prepTimeS.equals("")){
           outputTxtArea.setText("Please insert the values."); 
          return;
        }
        if (prepTimeF.equals("")){
            prepTimeF = "0";
        }
        if (prepTimeS.equals("")){
           prepTimeS = prepTimeF;    
        }
        firstInp = Integer.parseInt(prepTimeF);
        secInp = Integer.parseInt(prepTimeS);
        if (firstInp > secInp) {
           outputTxtArea.setText("First field should be less/ equal to Second field."); 
          return;
        }   
        recipePresenter.recipesForCategoryAndPreparationTime(catTxt, prepTimeF, prepTimeF);
    }//GEN-LAST:event_categoryAndPreparationTimeButtonActionPerformed

    private void mainIngredientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainIngredientButtonActionPerformed
        String ingr = mainIngredientTextField.getText();
        if (ingr.equals("")) {
            outputTextArea.setText("Please insert an ingredient\n"); 
            return;  
        }else{
        recipePresenter.numbOfRecWithMainIngr(ingr);
        }
    }//GEN-LAST:event_mainIngredientButtonActionPerformed

    private void categoryAndCobinedTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryAndCobinedTimeButtonActionPerformed
        String catTxt = catTxtField.getText();
        String combTimeF = combTimeTxtFieldFirst.getText();
        String combTimeS = combTimeTxtFieldSec.getText();
        if (catTxt.equals("")) {
            outputTextArea.setText("Please insert a category\n"); 
            return;  
        }
        int firstInp;
        int secInp;
        if (combTimeF.equals("") && combTimeS.equals("")){
           outputTextArea.setText("Please insert the values."); 
          return;
        }
        if (combTimeF.equals("")){
            combTimeF = "0";
        }
        if (combTimeS.equals("")){
           combTimeS = combTimeF;    
        }
        firstInp = Integer.parseInt(combTimeF);
        secInp = Integer.parseInt(combTimeS);
        if (firstInp > secInp) {
           outputTextArea.setText("First field should be less/ equal to Second field."); 
          return;
        }
        return;
        if ( firstInp == 0 )
            return;
        int t = getTimes( combTimeF, combTimeS );
        if ( t == null )
            return;    
        recipePresenter.recCatCombTime( catTxt, firstInp, secInp );
    }//GEN-LAST:event_categoryAndCobinedTimeButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        outputTextArea.setText( "" );
        nameTextField.setText( "" );
        categoryTextField.setText( "" );
        preparationTimeTextField1.setText( "" );
        preparationTimeTextField2.setText( "" );
        cookingTimeTextField1.setText( "" );
        cookingTimeTextField2.setText( "" );
        combinedTimeTextField1.setText( "" );
        combinedTimeTextField2.setText( "" );
        mainIngredientTextField.setText( "" );                                                            
    }//GEN-LAST:event_clearButtonActionPerformed

    private int getTimes( String tf1, String tf2) {      
        int firstInp;
        int secInp;
        if (combTimeF.equals("") && combTimeS.equals("")){
           outputTextArea.setText("Please insert the values."); 
          return 0;
        }
        if (combTimeF.equals("")){
            combTimeF = "0";
        }
        if (combTimeS.equals("")){
           combTimeS = combTimeF;    
        }
        firstInp = Integer.parseInt(tf1);
        secInp = Integer.parseInt(tf2);
        if (firstInp > secInp) {
           outputTextArea.setText("First field should be less/ equal to Second field."); 
          return 0;
        }
        return t;
    }
    
    //IView implementation
    @Override
    public void setOutputTextArea( String str ) {
        outputTxtArea.setText( str );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CombinedCookingTimeLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton categoryAndCobinedTimeButton;
    private javax.swing.JButton categoryAndPreparationTimeButton;
    private javax.swing.JButton categoryButton;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextField categoryTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField combinedTimeTextField1;
    private javax.swing.JTextField combinedTimeTextField2;
    private javax.swing.JLabel cookingTimeLabel;
    private javax.swing.JTextField cookingTimeTextField1;
    private javax.swing.JTextField cookingTimeTextField2;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainIngredientButton;
    private javax.swing.JLabel mainIngredientLabel;
    private javax.swing.JTextField mainIngredientTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JLabel preparationTimeLabel;
    private javax.swing.JTextField preparationTimeTextField1;
    private javax.swing.JTextField preparationTimeTextField2;
    private javax.swing.JLabel queryLabel;
    // End of variables declaration//GEN-END:variables
}
