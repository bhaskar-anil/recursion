# recursion
by defination: Recursion is the repeated application of a recursive procedure or definition.

To understand the recursion we can take an example as I gave answer on stackoverflow <a href="http://stackoverflow.com/questions/21032358/problems-with-understanding-recursion/28824792#28824792">here</a>
Suppose you want to know what is eligibility to become a prime minister of US, which is:

You have to be national citizen of US, for which here is the rule:

<ul><li>You are a natural born of US (or)</li>
<li>Your parents are national citizen of US</li></ul>

Now, first option straight forward makes you citizen of US, or same whole thing applies to your parents, which may again check for their parents ..and so on.

So there will be a straight forward answer, which is here 1st option. That is called Base Case. And in 2nd option you might apply same process of checking citizenship for your parents.

Here is a very simple pseudo code that can explain recursion:

<pre>
isEligibleForPrimeMinister checkCitizenship(You, yourParents){
            Base Case {returns true(That you are US citizen)}
            checkCitizenship(yourParents, YourGrandParents)
          }</pre>

Here is the list of implemented examples:
<i>If you learning it from scratch, I suggest try to write it by yourself then look the code to take a hint, don't memorize the code.
<ol>
<li>Factorial</li>
<li>LCM</li>
<li>GCD</li>
<li>Prime Number</li>
<li>Multiplication</li>
</ol>

PS: <i>I am no expert, I would more than happy if you fork and suggest me an improvement in code in terms of better time complexity of code.</i>
