public class CurrencyCalculator {

    public double getCurrency(String currency,String currency2, double amount){
        double result = 0;
        switch (currency){
            case "Euro":
                if(currency2.equals("Swedish crown")){
                    result = amount * 10.11;
                }else if(currency2.equals("Yen")){
                    result = amount * 132.16;
                }else if(currency2.equals("USD")){
                    result = amount * 1.22;
                }else { result = amount;}
                break;
            case "Swedish crown":
                if(currency2.equals("Euro")){
                    result = amount * 0.099;
                }else if(currency2.equals("Yen")){
                    result = amount * 13.07;
                }else if(currency2.equals("USD")){
                    result = amount * 0.12;
                }else { result = amount;}
                break;
            case "Yen":
                if(currency2.equals("Euro")){
                    result = amount * 0.0076;
                }else if(currency2.equals("Swedish crown")){
                    result = amount * 0.076;
                }else if(currency2.equals("USD")){
                    result = amount * 0.0092;
                }else { result = amount;}
                break;
            case "USD":
                if(currency2.equals("Euro")){
                    result = amount * 0.82;
                }else if(currency2.equals("Swedish crown")){
                    result = amount * 8.31;
                }else if(currency2.equals("Yen")){
                    result = amount * 108.53;
                }else { result = amount;}
                break;
        }
        return result;
    }
}
