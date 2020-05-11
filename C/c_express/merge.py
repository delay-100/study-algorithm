import sys, os

# chapters = os.listdir("./")
# problems = []
# for chap in chapters:
#     problems.append(os.listdir(chap))

# print(problems)

full_path = []

for (path, dir, files) in os.walk("./"):
    for filename in files:
        ext = os.path.splitext(filename)[-1]
        if ext == '.c':
            full_path.append(path + "/" + filename)

print(full_path)

lines_list = []
for path in full_path:
    try:
        with open(path, "r", encoding='UTF8') as f:
            lines_list.append(f.readlines())
    except:
        with open(path, "r", encoding='CP949') as f:
            lines_list.append(f.readlines())

with open("merged.c", "w", encoding='UTF8') as f:
    for lines, path in zip(lines_list, full_path):
        f.write("// "+path+"\n")

        for line in lines:
            f.write(line)
        f.write("\n\n\n")
        f.write("//****************************************************************************//")
        f.write("\n")
