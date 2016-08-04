package com.example.android.americanpersonaltaxreturncalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void calculateTaxes(View view){
        int familyMembers=0;
        double totalIncome = 0.00;
        double incomeAdjustments=0.00;
        double totalCredits=0.00;
        double adjustedGrossIncome=0.00;
        CheckBox checkBox1=(CheckBox)findViewById(R.id.person_filing_check_box);
        if (checkBox1.isChecked()){
            familyMembers++;
        }
        CheckBox checkBox2=(CheckBox)findViewById(R.id.spouse_check_box);
        if (checkBox2.isChecked()){
            familyMembers++;
        }
        try {
            EditText editText1 = (EditText) findViewById(R.id.children_who_lived_with_taxpayer_edit_text);
            familyMembers += Integer.parseInt(editText1.getText().toString());
            EditText editText2 = (EditText) findViewById(R.id.children_who_did_not_live_with_taxpayer_edit_text);
            familyMembers += Integer.parseInt(editText2.getText().toString());
            EditText editText3 = (EditText) findViewById(R.id.unlisted_dependents_edit_text);
            familyMembers += Integer.parseInt(editText3.getText().toString());
            EditText editText4 = (EditText) findViewById(R.id.tips_salaries_wages_etc__edit_text);
            totalIncome += Double.parseDouble(editText4.getText().toString());
            EditText editText5 = (EditText) findViewById(R.id.taxable_interest_edit_text);
            totalIncome += Double.parseDouble(editText5.getText().toString());
            EditText editText7 = (EditText) findViewById(R.id.ordinary_dividends_edit_text);
            totalIncome += Double.parseDouble(editText7.getText().toString());
            EditText editText9 = (EditText) findViewById(R.id.offsets_edit_text);
            totalIncome += Double.parseDouble(editText9.getText().toString());
            EditText editText10 = (EditText) findViewById(R.id.alimony_received_edit_text);
            totalIncome += Double.parseDouble(editText10.getText().toString());
            EditText editText11 = (EditText) findViewById(R.id.buisness_income_or_loss_edit_text);
            totalIncome += Double.parseDouble(editText11.getText().toString());
            EditText editText12 = (EditText) findViewById(R.id.capital_gain_or_loss_edit_text);
            totalIncome += Double.parseDouble(editText12.getText().toString());
            EditText editText13 = (EditText) findViewById(R.id.other_gains_or_losses_edit_text);
            totalIncome += Double.parseDouble(editText13.getText().toString());
            EditText editText14 = (EditText) findViewById(R.id.taxable_amount_of_IRA_distributions_edit_text);
            totalIncome += Double.parseDouble(editText14.getText().toString());
            EditText editText15 = (EditText) findViewById(R.id.taxable_amount_of_annunites_and_pensions_edit_text);
            totalIncome += Double.parseDouble(editText15.getText().toString());
            EditText editText16 = (EditText) findViewById(R.id.income_from_S_corporations____edit_text);
            totalIncome += Double.parseDouble(editText16.getText().toString());
            EditText editText17 = (EditText) findViewById(R.id.farm_income_or_loss_edit_text);
            totalIncome += Double.parseDouble(editText17.getText().toString());
            EditText editText18 = (EditText) findViewById(R.id.unemployment_compensation_edit_text);
            totalIncome += Double.parseDouble(editText18.getText().toString());
            EditText editText19 = (EditText) findViewById(R.id.taxable_amount_of_social_security_benifits_edit_text);
            totalIncome += Double.parseDouble(editText19.getText().toString());
            EditText editText20 = (EditText) findViewById(R.id.other_income_edit_text);
            totalIncome += Double.parseDouble(editText20.getText().toString());
            TextView textView1 = (TextView) findViewById(R.id.income_text_view);
            textView1.setText("Total income is $" + totalIncome);
        }catch (Exception e){
            TextView textView1=(TextView)findViewById(R.id.income_text_view);
            textView1.setText("There is an error");
        }
        try {
            EditText editText21 = (EditText) findViewById(R.id.educator_expenses_edit_text);
            incomeAdjustments += Double.parseDouble(editText21.getText().toString());
            EditText editText22 = (EditText) findViewById(R.id.certain_buisness_expenses_edit_text);
            incomeAdjustments += Double.parseDouble(editText22.getText().toString());
            EditText editText23 = (EditText) findViewById(R.id.health_savings_account_deduction);
            incomeAdjustments += Double.parseDouble(editText23.getText().toString());
            EditText editText24 = (EditText) findViewById(R.id.moving_expenses_edit_text);
            incomeAdjustments += Double.parseDouble(editText24.getText().toString());
            EditText editText25 = (EditText) findViewById(R.id.deductible_part_of_self_employment_tax_edit_text);
            incomeAdjustments += Double.parseDouble(editText25.getText().toString());
            EditText editText26 = (EditText) findViewById(R.id.plans_edit_text);
            incomeAdjustments += Double.parseDouble(editText26.getText().toString());
            EditText editText27 = (EditText) findViewById(R.id.self_employed_health_insurance_deduction_edit_text);
            incomeAdjustments += Double.parseDouble(editText27.getText().toString());
            EditText editText28 = (EditText) findViewById(R.id.savings_edit_text);
            incomeAdjustments += Double.parseDouble(editText28.getText().toString());
            EditText editText29 = (EditText) findViewById(R.id.alimony_paid_edit_text);
            incomeAdjustments += Double.parseDouble(editText29.getText().toString());
            EditText editText30 = (EditText) findViewById(R.id.IRA_deduction_edit_text);
            incomeAdjustments += Double.parseDouble(editText30.getText().toString());
            EditText editText31 = (EditText) findViewById(R.id.student_loan_interest_deduction_edit_text);
            incomeAdjustments += Double.parseDouble(editText31.getText().toString());
            EditText editText32 = (EditText) findViewById(R.id.tuiton_and_fees_edit_text);
            incomeAdjustments += Double.parseDouble(editText32.getText().toString());
            EditText editText33 = (EditText) findViewById(R.id.domestic_production_activities_deduction_edit_text);
            incomeAdjustments += Double.parseDouble(editText33.getText().toString());
            adjustedGrossIncome = totalIncome - incomeAdjustments;
            TextView textView=(TextView)findViewById(R.id.adjusted_gross_income_text_view);
            textView.setText("Adjusted gross income is $"+adjustedGrossIncome);
        }catch (Exception e){
            TextView textView=(TextView)findViewById(R.id.adjusted_gross_income_text_view);
            textView.setText("There is an error");
        }
        try {

            EditText editText34 = (EditText) findViewById(R.id.itemized_deductions_edit_text);
            double itemizedDeductions = Double.parseDouble(editText34.getText().toString());
            adjustedGrossIncome -= itemizedDeductions;
            EditText editText35 = (EditText) findViewById(R.id.exemptions_edit_text);
            double exemptions = Double.parseDouble(editText35.getText().toString());
            adjustedGrossIncome -= exemptions;
            EditText editText36 = (EditText) findViewById(R.id.tax_edit_text);
            double sumOfLinesFortyThreeFortyFourAndFortyFive = Double.parseDouble(editText36.getText().toString());
            EditText editText37 = (EditText) findViewById(R.id.alternative_minimum_tax_edit_text);
            sumOfLinesFortyThreeFortyFourAndFortyFive += Double.parseDouble(editText37.getText().toString());
            EditText editText38 = (EditText) findViewById(R.id.advance_premium_tax_credit_repayment_edit_text);
            sumOfLinesFortyThreeFortyFourAndFortyFive += Double.parseDouble(editText38.getText().toString());
            EditText editText39 = (EditText) findViewById(R.id.foreign_tax_credit_edit_text);
            totalCredits = Double.parseDouble(editText39.getText().toString());
            EditText editText40 = (EditText) findViewById(R.id.credit_for_dependent_and_child_care_expenses_edit_text);
            totalCredits += Double.parseDouble(editText40.getText().toString());
            EditText editText41 = (EditText) findViewById(R.id.education_credits_edit_text);
            totalCredits += Double.parseDouble(editText41.getText().toString());
            EditText editText42 = (EditText) findViewById(R.id.retirement_savings_contribution_credit_edit_text);
            totalCredits += Double.parseDouble(editText42.getText().toString());
            EditText editText43 = (EditText) findViewById(R.id.child_tax_credit_edit_text);
            totalCredits += Double.parseDouble(editText43.getText().toString());
            EditText editText44 = (EditText) findViewById(R.id.residential_energy_credits_edit_text);
            totalCredits += Double.parseDouble(editText44.getText().toString());
            EditText editText45 = (EditText) findViewById(R.id.other_credits_edit_text);
            totalCredits += Double.parseDouble(editText45.getText().toString());
            TextView textView = (TextView) findViewById(R.id.tax_and_credits_text_view);
            textView.setText("Total credits are $" + totalCredits);
            double creditChanges=sumOfLinesFortyThreeFortyFourAndFortyFive-totalCredits;
            if(totalCredits>sumOfLinesFortyThreeFortyFourAndFortyFive){
                creditChanges=0.00;
            }
        }catch (Exception e){
            TextView textView=(TextView)findViewById(R.id.tax_and_credits_text_view);
            textView.setText("There is an error");
        }
        try {
            EditText editText46 = (EditText) findViewById(R.id.self_employment_tax_edit_text);
            double totalTax = Double.parseDouble(editText46.getText().toString());
            EditText editText47 = (EditText) findViewById(R.id.medicare_and_social_security_tax_edit_text);
            totalTax += Double.parseDouble(editText47.getText().toString());
            EditText editText48 = (EditText) findViewById(R.id.additional_taxes_on_IRAs_edit_text);
            totalTax += Double.parseDouble(editText48.getText().toString());
            EditText editText49 = (EditText) findViewById(R.id.household_employment_taxes_edit_text);
            totalTax += Double.parseDouble(editText49.getText().toString());
            EditText editText50 = (EditText) findViewById(R.id.first_time_homebuyer_credit_repayment_edit_text);
            totalTax += Double.parseDouble(editText50.getText().toString());
            EditText editText51 = (EditText) findViewById(R.id.health_care_individual_responsibility_edit_text);
            totalTax += Double.parseDouble(editText51.getText().toString());
            EditText editText52 = (EditText) findViewById(R.id.taxes_from_edit_text);
            totalTax += Double.parseDouble(editText52.getText().toString());
            TextView textView = (TextView) findViewById(R.id.total_tax_text_view);
            textView.setText("Total tax is $" + totalTax);
        }catch (Exception e){
            TextView textView=(TextView)findViewById(R.id.total_tax_text_view);
            textView.setText("There is an error");
        }
    }
}
//Nefesh B'Nefesh 201-246-6526
//Doctor 905-764-0005 after hours 416-477-2844
