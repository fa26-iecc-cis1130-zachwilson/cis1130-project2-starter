# CIS 1130 Project 2 Starter Code: Stats Tracker

This repository has the starter file for Project 2. The menu already works; you fill in the methods marked `TODO`.

**Don't fork this repository or submit it.** Copy `StatsTracker.java` into the private `project2` repository in your own course organization.

## Get the starter file

In JupyterHub, open a Terminal and run these commands. Replace `YOUR-ORG` with your organization name (`cis1130-fa26-<your username>`).

```bash
git clone https://github.com/YOUR-ORG/project2.git
cd project2
wget https://raw.githubusercontent.com/fa26-iecc-cis1130-zachwilson/cis1130-project2-starter/main/StatsTracker.java
wget https://raw.githubusercontent.com/fa26-iecc-cis1130-zachwilson/cis1130-project2-starter/main/.gitignore
```

If you already cloned `project2`, skip the first command and just `cd project2`.

**Another way:** open `StatsTracker.java` on this page, select **Raw**, copy everything, and paste it into a new `StatsTracker.java` file in your `project2` folder in VS Code.

## Run it

```bash
javac StatsTracker.java
java StatsTracker
```

It runs right away. Options 1 to 5 print "not done yet" until you fill them in.

## Suggested order

| Step | Method(s) | Test it with |
|------|-----------|--------------|
| 1 | Replace the sample data with your own | Option 6 (it should still compile and quit) |
| 2 | `rowTotal`, `rowAverage`, `showTable` | Option 1. Check one row's total and average by hand. |
| 3 | `findRow`, `search` | Option 2 with a name in odd capitalization, and a name that isn't there |
| 4 | `sortByAverage` | Option 3, then option 1 to confirm names still match their data |
| 5 | `columnReport` | Option 4. Compare with your DESIGN.md test case. |
| 6 | `updateValue` | Option 5 with a bad name, a bad column number, and a good update |

Commit and push after each step:

```bash
git add .
git commit -m "Finish show table"
git push
```

## What's provided

- `main` with the sample data and a working `do-while` menu with a `switch`
- `printMenu`, `readInt` (rejects input that isn't a whole number), and `printRanking`

Everything else is yours. The code you write must be your own.
