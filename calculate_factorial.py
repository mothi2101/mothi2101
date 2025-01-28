def factorial(n):
  """This function calculates the factorial of a non-negative integer."""
  if n == 0:
    return 1
  else:
    return n * factorial(n-1)

# Get input from the user
num = int(input("Enter a non-negative integer: "))

# Calculate and print the factorial
if num < 0:
  print("Factorial is not defined for negative numbers.")
else:
  result = factorial(num)
  print("The factorial of", num, "is", result)
