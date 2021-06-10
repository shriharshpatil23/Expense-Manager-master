package com.Group_No_25.Expense_Manager.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import android.app.DatePickerDialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.Group_No_25.Expense_Manager.R;
import com.Group_No_25.Expense_Manager.transactionDb.AppDatabase;
import com.Group_No_25.Expense_Manager.transactionDb.AppExecutors;
import com.Group_No_25.Expense_Manager.transactionDb.TransactionEntry;
import com.Group_No_25.Expense_Manager.transactionDb.TransactionViewModel;
import com.Group_No_25.Expense_Manager.utils.Constants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;

import com.Group_No_25.Expense_Manager.R;
import com.Group_No_25.Expense_Manager.adapters.SectionsPageAdapter;
import com.Group_No_25.Expense_Manager.fragments.BalanceCategoryFragment;
import com.Group_No_25.Expense_Manager.fragments.BalanceFragment;
import com.Group_No_25.Expense_Manager.fragments.CustomBottomSheetDialogFragment;
import com.Group_No_25.Expense_Manager.fragments.ExpenseFragment;

 import static com.Group_No_25.Expense_Manager.activities.MainActivity.fab;

//public class BalanceCategoryFragment {
//}
public class BalanceCategoryFragment extends Fragment {

    CardView education_card;
    CardView food_card;
    CardView travel_card;
    CardView health_card;
    CardView other_card;

    EditText education_et;
    EditText food_et;
    EditText travel_et;
    EditText health_et;
    EditText other_et;

    TextView education_text;
    TextView food_text;
    TextView travel_text;
    TextView health_text;
    TextView other_text;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view=inflater.inflate(R.layout.balance_fragment,container,false);
        education_card = view.findViewById(R.id.education_card_view);
        food_card = view.findViewById(R.id.Food_card_view);
        travel_card = view.findViewById(R.id.travel_card_view);
        health_card = view.findViewById(R.id.health_card_view);
        other_card = view.findViewById(R.id.other_card_view);


        education_et = view.findViewById(R.id.Education_title_name);
        food_et = view.findViewById(R.id.Food_title_name);
        travel_et = view.findViewById(R.id.Travel_title_name);
        health_et = view.findViewById(R.id.health_title_name);
        other_et = view.findViewById(R.id.other_title_name);


        education_text = view.findViewById(R.id.education_balance_view);
        food_text = view.findViewById(R.id.food_balance_view);
        travel_text = view.findViewById(R.id.travel_balance_view);
        health_text = view.findViewById(R.id.health_balance_view);
        other_text = view.findViewById(R.id.other_balance_view);





        return view;
    }


}