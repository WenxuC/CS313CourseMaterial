import os, subprocess, xlwt
from xlwt import Workbook

wb = Workbook()

def fillSize(size):
    sheet.write(0, 0, 'Size')
    row = 1
    i = 1
    while i < size:
        sheet.write(row, 0, i)
        i *= 2
        row += 1


def run(file_path, exe_file, col, size):
    row = 1
    sheet.write(0, col, file_path)
    os.chdir(file_path)
    i = 1
    while i < size:
        exe = exe_file + str(i)
        output = subprocess.Popen(exe, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, shell=True)
        stdout= output.communicate()[0]
        sheet.write(row, col, stdout)
        wb.save('/Users/Alex/Documents/CS313/AlgorithmAnalysis/Testing/runtime result.xls')
        row += 1
        i *= 2
    os.chdir('..')

sheet = wb.add_sheet('Constant v. Linear')
fillSize(1000000000)
print('constant')
run('constant', './a.out ', 1, 1000000000)

print('linear')
run('linear', './a.out ', 2, 1000000000)


sheet = wb.add_sheet('Max Range')
fillSize(1000000000)
print('Rlinear')
run('RangeLinear', './a.out ', 1, 1000000000)

print('RQuad')
run('RangeQuadratic', './a.out ', 2, 2000000)