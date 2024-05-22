import tkinter as tk
from tkinter import simpledialog, messagebox

def calculate_reimbursement():
    # Initialize the Tkinter root widget
    root = tk.Tk()
    root.withdraw()  # Hide the root window

    # Get the input values from the user
    miles = simpledialog.askfloat("Input", "How many miles have you done?")
    cents_per_gallon = simpledialog.askfloat("Input", "How much are you being paid per gallon?")

    # Calculate the total reimbursement
    total = miles * cents_per_gallon
    total_rounded = round(total, 2)

    # Display the total reimbursement
    messagebox.showinfo("Reimbursement", f"Your total reimbursement is ${total_rounded}")

    # Ask if the user wants to repeat
    repeat = messagebox.askyesno("Repeat", "Would you like to repeat?")

    if repeat:
        calculate_reimbursement()  # Repeat the process if the user wants to

# Run the calculator
calculate_reimbursement()
