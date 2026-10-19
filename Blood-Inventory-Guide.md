# Blood Inventory Guide

## Overview
Tracks available units of different blood groups.

## Features
- Add blood units for a blood group.
- Check available units.
- Display zero for unregistered blood groups.
- Reject zero or negative unit additions.

## Supported Blood Groups
A+, A-, B+, B-, AB+, AB-, O+, O-.

## How to Run
Compile: `javac src/BloodInventory.java`
Run: `java -cp src BloodInventory`

## Limitations
- Stock is stored temporarily in memory.
- Data is lost when the program exits.
- This is a demonstration, not a live blood bank system.

## Purpose
Demonstrates Java collections, validation, and blood-stock management.
