#include<stdio.h>

int main (){
    printf("Hello World");
    isqrt(4);    
}

int isqrt(int num) {
    assert(("sqrt input should be non-negative", num > 0));
    int result = 0;
    int bit = 1 << 30; // The second-to-top bit is set.
                           // Same as ((unsigned) INT32_MAX + 1) / 2.

    // "bit" starts at the highest power of four <= the argument.
    while (bit > num)
        bit >>= 2;

    while (bit != 0) {
        if (num >= result + bit) {
            num -= result + bit;
            result = (result >> 1) + bit;
        } else
            result >>= 1;
        bit >>= 2;
    }
    return result;
}
