package karachistockexchange.appinhand.com.resistor_new;

import java.text.NumberFormat;

/**
 * Created by APPXONE on 12/30/2015.
 */
public class formating {

String value;
    NumberFormat format;
String dd;
    public  void format_check()
    {
        //MainActivity.combine_values.setText("sds");
        if(MainActivity.third_band_value.equalsIgnoreCase("1"))
        {
            value=  String.valueOf(MainActivity.combine_first_second);
         //   MainActivity.combine_values.setText(String.valueOf(MainActivity.combine_first_second));
            MainActivity.combine_values.setText(value.charAt(0)+""+value.charAt(1)+" ");
        }
       else if(MainActivity.third_band_value.equalsIgnoreCase("10"))
        {

            value=  String.valueOf(MainActivity.combine_first_second);
           // MainActivity.combine_values.setText(String.valueOf(MainActivity.combine_first_second));
            MainActivity.combine_values.setText(value+"0");


        }

        else if(MainActivity.third_band_value.equalsIgnoreCase("100"))
        {

            //format=new DecimalFormat("##.##");
            value=  String.valueOf(MainActivity.combine_first_second);

        // value   =  format.format(MainActivity.combine_first_second);
        //  dd=  String.format("%2.0f", MainActivity.combine_first_second);
            MainActivity.combine_values.setText(value.charAt(0)+"."+value.charAt(1)+" k");

        }

        else if(MainActivity.third_band_value.equalsIgnoreCase("1000"))
        {

            value=  String.valueOf(MainActivity.combine_first_second);
            MainActivity.combine_values.setText(value.charAt(0)+""+value.charAt(1)+" k");


        }

        else if(MainActivity.third_band_value.equalsIgnoreCase("10000"))
        {

            value=  String.valueOf(MainActivity.combine_first_second);

            MainActivity.combine_values.setText(value.charAt(0)+""+value.charAt(1)+"0"+" k");
        }

        else if(MainActivity.third_band_value.equalsIgnoreCase("100000"))
        {
            value=  String.valueOf(MainActivity.combine_first_second);

            MainActivity.combine_values.setText(value.charAt(0)+"."+value.charAt(1)+" M");

        }

        else if(MainActivity.third_band_value.equalsIgnoreCase("1000000"))
        {


            value=  String.valueOf(MainActivity.combine_first_second);

            MainActivity.combine_values.setText(value.charAt(0)+""+value.charAt(1)+" M");

        }
        else if(MainActivity.third_band_value.equalsIgnoreCase("10000000"))
        {

            value=  String.valueOf(MainActivity.combine_first_second);

            MainActivity.combine_values.setText(value.charAt(0)+""+value.charAt(1)+""+"0"+" M");
        }

        else if(MainActivity.third_band_value.equalsIgnoreCase("100000000"))
        {

            value=  String.valueOf(MainActivity.combine_first_second);

            MainActivity.combine_values.setText(value.charAt(0)+"."+value.charAt(1)+" G");

        }


        else if(MainActivity.third_band_value.equalsIgnoreCase("1000000000"))
        {


            value=  String.valueOf(MainActivity.combine_first_second);

            MainActivity.combine_values.setText(value.charAt(0)+""+value.charAt(1)+" G");

        }


        else if(MainActivity.third_band_value.equalsIgnoreCase("0.1"))
        {

            value=  String.valueOf(MainActivity.combine_first_second);

            //MainActivity.combine_values.setText(value.charAt(0)+"."+value.charAt(1));
            MainActivity.combine_values.setText(value.charAt(0)+"."+value.charAt(1)+" ");
        }

        else if(MainActivity.third_band_value.equalsIgnoreCase("0.01"))
        {

            value=  String.valueOf(MainActivity.combine_first_second);

            //MainActivity.combine_values.setText(value.charAt(0)+"."+value.charAt(1)+""+value.charAt(2));
            MainActivity.combine_values.setText("0."+value+" ");
        }
//
//
//        for (Map.Entry<String, String> entry1 : MainActivity.color_Coding_band3.entrySet()) {
//            if (entry1.getValue().equalsIgnoreCase(MainActivity.fourth_band_value)) {
//                second_band_value = entry1.getValue();
//
//
//
//            }
//           else if (entry1.getValue().equalsIgnoreCase(MainActivity.fourth_band_value)) {
//                second_band_value = entry1.getValue();
//
//
//
//            }
//        }


    }
}
