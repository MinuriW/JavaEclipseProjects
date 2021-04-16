class SavingsAccount implements  MaintainanceCharge
{
    public float computeMaintainanceCharge(int n)
        {
            float m = 50;
            return 2*m*n+50;
        }
    }