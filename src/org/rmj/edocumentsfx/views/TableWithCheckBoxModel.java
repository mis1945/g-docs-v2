package org.rmj.edocumentsfx.views;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

/**
 *
 * @author user
 */
public class TableWithCheckBoxModel {
    private SimpleStringProperty index01;
    private SimpleStringProperty index02;
    private SimpleStringProperty index03;
    private SimpleStringProperty index04;
    private CheckBox index05;
 
    
    public TableWithCheckBoxModel(String index01,String index02, String index03, String index04, String value){
        this.index01 = new SimpleStringProperty(index01);
        this.index02 = new SimpleStringProperty(index02);
        this.index03 = new SimpleStringProperty(index03);
        this.index04 = new SimpleStringProperty(index04);
        this.index05 = new CheckBox();
        
    }
    
    public String getIndex01(){return index01.get();}
    public void setIndex01(String index01){this.index01.set(index01);}
    
    public String getIndex02(){return index02.get();}
    public void setIndex02(String index02){this.index02.set(index02);}
    
    public String getIndex03(){return index03.get();}
    public void setIndex03(String index03){this.index03.set(index03);}
    
     public String getIndex04(){return index04.get();}
    public void setIndex04(String index04){this.index04.set(index04);}
    
    public CheckBox getIndex05(){return index05;}
    public void setIndex05(CheckBox index05){this.index05 = index05;} 
}
   
