import Member.*;


public class Calculate {

    public int total_stat(int GK_Stat, int DF_Stat, int MF_Stat, int FW_Stat, int Condition) {

        return GK_Stat+ DF_Stat + MF_Stat+FW_Stat+Condition;
    }

    public int Physical_stat(int Height, int Weight){

        return Height/Weight*50;
    }

}
