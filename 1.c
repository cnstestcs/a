#include <stdio.h>

int main(void)
{
    char *str = "Hello world";
    int i = 0;

    printf("Result after XOR with 0:\n");

    while (str[i] != '\0')
    {
        char result = str[i] ^ 0;
        printf("%c", result);
        i++;
    }

    printf("\n");

    return 0;
}
