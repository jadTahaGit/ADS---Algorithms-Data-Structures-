def squareRootFunction(x):

    r = x
    precision = 10 ** (-10)

    while abs(x - r * r) > precision:
        r = (r + x / r) / 2

    # return r
    print(r)


x = 25
squareRootFunction(25)
