import os, subprocess, xlwt
from xlwt import Workbook

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
        output = subprocess.Popen(exe, stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
        stdout, stderr = output.communicate()
        sheet.write(row, col, stdout)
        row += 1
        i *= 2
    os.chdir('..')

wb = Workbook()

sheet = wb.add_sheet('Constant v. Linear')
fillSize(2000000000)
run('constant', 'main.exe ', 1, 2000000000)
run('linear', 'main.exe ', 2, 200000000)

sheet = wb.add_sheet('Max Range')
fillSize(200000000)
run('RangeLinear', 'main.exe ', 1, 200000000)
run('RangeQuadratic', 'main.exe ', 2, 200000)


wb.save('runtime results.xls')