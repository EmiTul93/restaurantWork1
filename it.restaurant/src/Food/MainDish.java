package Food;

import java.util.List;

public class MainDish extends MenuItem{


    public MainDish(String name,double price,List<MenuTypeEnum> type,boolean isRecommended,String stringOfIngredients){
        super(name,price,type,isRecommended,stringOfIngredients);
    }

    @Override
    public String getDetails(){
        return super.getDetails();
    }
}
