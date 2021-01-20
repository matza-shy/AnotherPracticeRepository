function double(x)
{
	double res = x * 2;
	return res;
}

function add(x, y)
{
	double res = x + y;
	return res;
}


function sub(x, y)
{
	double res = x - y;
	return res;
}

function main()
{
	num = 8; /* Very Volatile */
	print(double(num));/* Why double? */
	print(add(num, num));/* Addition ? */
	print(sub(num, num));/* substraction ? */

	return;
}
