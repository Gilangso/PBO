public class Determinan {
    float a,b,c,det,x1,x2;

    public Determinan(float a, float b, float c){
        this.a=a;
        this.b=b;
        this.c=c;
        det = setDet(a,b,c);
        if(det>0){
            x1 = (-b+(float)Math.sqrt(det))/2*a;
            x2 = (-b-(float)Math.sqrt(det))/2*a;
        } else if(det<0){
            x1 = (-b/2*a)+((float)Math.sqrt(-det)/2*a);
            x2 = (-b/2*a)-((float)Math.sqrt(-det)/2*a);
        } else {
            x1 = (-b/(2*a));
            x2 =x1;
        }

    }

    public float setDet(float a, float b, float c){
        float det;
        det = (b*b)-(4*a*c);
        return det;
    }

}