## Exercise 3: Parameter Passing and Scope

- Why doesn't the integer change after the method call?

    It does not change because the value of `number` is copied into the parameter `num`. `num` has a scope only in the function and will no longer be used outside the function.

- Why does the array change after the method call?

    Array changes after the method call because the value stored in `arr` is a memory address to an array, and the the array itself. So, when you double the values in `array`, that will change the actual values of the original array since they are not being copied over to the scope of the function.

- What happens when you try to access y outside the loop?

    You will get a compile time error because the value of `y` gets discarded since its scope is no longer being used. Therefore, `y` will not exist.