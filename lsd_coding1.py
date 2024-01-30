def zero(op=None):
    if op is not None:
        return eval(''.join(['0']+op))
    else:
        return '0'
def one(op=None):
    if op is not None:
        return eval(''.join(['1']+op))
    else:
        return '1'
def two(op=None):
    if op is not None:
        return eval(''.join(['2']+op))
    else:
        return '2'
def three(op=None):
    if op is not None:
        return eval(''.join(['3']+op))
    else:
        return '3'
def four(op=None):
    if op is not None:
        return eval(''.join(['4']+op))
    else:
        return '4'
def five(op=None):
    if op is not None:
        return eval(''.join(['5']+op))
    else:
        return '5'
def six(op=None):
    if op is not None:
        return eval(''.join(['6']+op))
    else:
        return '6'
def seven(op=None):
    if op is not None:
        return eval(''.join(['7']+op))
    else:
        return '7'
def eight(op=None):
    if op is not None:
        return eval(''.join(['8']+op))
    else:
        return '8'
def nine(op=None):
    if op is not None:
        return eval(''.join(['9']+op))
    else:
        return '9'

def plus(arg):
    return ['+',arg]
def minus(arg):
    return ['-',arg] #your code here
def times(arg):
    return ['*',arg]
def divided_by(arg):
    return ['//',arg]

print(six(divided_by(two())))
print(zero(times(seven())))
