package teamtag.example.com.mch1exptrk;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ExpenseSkeletonAdapter expad;
    ArrayList<Expense> exp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exp = new ArrayList<>();
        expad = new ExpenseSkeletonAdapter(exp);
    }

    public void addExpense(){
        Expense exp;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Add New Expense");

        EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        
        expad.addExpense();
    }
}
