リテラルと進数
public class Main {
public static void main(String[] args) {
int a = 017;
int b = 0x1F;
int c = 0b1_010;

        System.out.println(a + b + c);
    }
}

int aは0から始まる進数のため８進数と判断できる。＝15 1の桁1*8　3の桁3＊8の0乗
int bは0Xから始まっているため、16進数と判断できる　＝　31
int cは0bから始まっているため、2進数と判断できる　＝　10

int x = 0x2A;
10進数にするなら
０Xだから16進数である。A=10 で　16の0乗　＋　16の1乗かける2 であるため、42かな？

public class Main {
public static void main(String[] args) {
int a = 0x1A;
int b = 032;
int c = 0b1_101;

        System.out.println(a + b + c);
    }
}

int aは16進数、16＋10　＝26
int bは8進数、24＋2＝26
int cは2進数、アンダースコアを抜いてob1101と考えると、8+4+0+1=15
出力される値は、65


コンパイルエラーはどれか、すべて選んで
A. int a = 0b1010;
B. int b = 0128;
C. int c = 0xCAFE;
D. int d = 1_000_000;
E. int e = 0x_FF;
F. int f = 0b10_10;
答え：B,D　　Dは正しいものでした正解はBとE。直後にアンダースコアは置けない
理由：Bは0から始まるため8進数であるとわかる。しかし、8があるためコンパイルエラー。Dは値が大きいためLong型を使用する

A. long a = 2147483648;
B. long b = 2147483648L;
C. float c = 10.0;
D. float d = 10.0F;
E. double e = 10;
F. byte f = 127;
G. byte g = 128;

答え：B,C,E,G
BとCはサフィックスをつけていない。
Eのdouble型は浮動小数点を扱うため、整数はintまたはLong、
Gはbyteが扱えるのは-127~127の値まで

A. byte a = 10;
B. byte b = 127;
C. byte c = 128;

D. short d = 100;
E. short e = 32767;
F. short f = 32768;

G. char g = 65535;
H. char h = 65536;

I. long i = 100;
J. float j = 100;
答えC,F,G,H、J