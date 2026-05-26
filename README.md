# WoW Professions

**Author**: David Everly  
**Language**: Java
**Status**: Active development  
Copyright © 2026 David Everly

---

A nice flowchart of reagent flow through select professions in World of Warcraft: Midnight

[Reagent Flowsheet Diagram](./reagent-flow.md)

## Purpose

This was a casual project aimed at:
1) Testing the capability of Claude Code to ingest and interpret abstract data from the internet with minimal guidance
2) Producing a useful diagram of reagent throughput to parties interested in playing World of Warcraft

---

## Developer Notes

After creating a minimal set of stubbed classes and interfaces in Java, I allowed Claude Code access to edit project source files.  I provided a **clear** but **concise** prompt for Claude:

```
I want to create stubbed classes so I can leverage automatically generated UML program in IntelliJ. The purpose is to track the flow of regents through my professions in world of warcraft midnight.  I started and would like you to help finish - focusing on the most important output from each profession that I created in the professions package
```

I analyzed the output to determine if Claude understood the context of the question and followed with:

```
The UML diagram is suboptimal to view the flow of reagents, can you create a diagram (not UML) that more easily tracks reagent flow?  I need to be able to see easily from ore -> prospect -> gem -> crush/craft -> end product and in reverse from missive -> ink -> pigment -> milling -> herb and for cross-profession relationships (ie: ore -> prospect -> gem -> crush -> create empty vial (jewelcrafting) -> create enchanting oil).
```

Followed by

```
Much better. Now, we need to expand this to include all important end products.  use the internet, especially pages which describe the most optimal gold-making recipes.  We can leave out the trivial recipes and leveling recipes -- I just want to see reagent flow through the high-yield recipes and those that the other listed professions depend on.  take your time to lookup relevant data and expand this project to include recipes like kaleidoscopic prism, decor items (from lumber), meta gems, transumutations, woundrous synergist, school of gems/rocks/herbs, high yield potions/phials, etc. for each profession
```

After prompting for the addition of tailoring recipes, the final output was analyzed and found to be, impressively, quite accurate.  Posted here so others might benefit from the output.

---

## License

This project is licensed under the **Apache License 2.0**.

You are free to use, modify, and distribute this software, including for
commercial purposes, subject to the terms of the license.