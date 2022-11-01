import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {
    int a, b, c;
    a = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de a: "));
    b = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de b: "));
    c = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de c: "));

    if((a>b) && (b>c)){
        JOptionPane.showMessageDialog(null,"Orden: "+a+"-"+b+"-"+c);
    }else if((a>c) && (c>b)){
        JOptionPane.showMessageDialog(null,"Orden: "+a+"-"+c+"-"+b);
    }else if((b>a) && (a>c)){
        JOptionPane.showMessageDialog(null,"Orden: "+b+"-"+a+"-"+c);
    }else if((b>c) && (c>a)){
        JOptionPane.showMessageDialog(null,"Orden: "+b+"-"+c+"-"+a);
    }else if((c>a) && (a>b)){
        JOptionPane.showMessageDialog(null,"Orden: "+c+"-"+a+"-"+b);
    }else{
        JOptionPane.showMessageDialog(null,"Orden: "+c+"-"+b+"-"+a);
    }
    }
}
