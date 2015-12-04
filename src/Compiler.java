import antlr.PLSQLLexer;
import antlr.PLSQLListener;
import antlr.PLSQLParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * Created by bino on 15-12-5.
 */
public class Compiler implements PLSQLListener {

    public List<String> compile(String plsql){
        plsql=plsql.toLowerCase();
        PLSQLLexer lexer = new PLSQLLexer(new ANTLRInputStream(plsql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PLSQLParser parser = new PLSQLParser(tokens);
        parser.addParseListener(this);
        //collect errors
        List<String> errors=new ArrayList<>();
        parser.addErrorListener(new CompilerErrorListener(errors));
        parser.statement();
        return errors;
    }

    public static void main(String[] args){
        String plsql="DECLARE ppl\n" +
                "   message  varchar2(20):= 'Hello, World!';\n" +
                "BEGIN\n" +
                "   dbms_output.put_line(message);\n" +
                "END;";
        Compiler compiler=new Compiler();
        for(String err:compiler.compile(plsql)){
            System.out.println(err);
        }

    }

    @Override
    public void enterFile(PLSQLParser.FileContext ctx) {

    }

    @Override
    public void exitFile(PLSQLParser.FileContext ctx) {

    }

    @Override
    public void enterShow_errors(PLSQLParser.Show_errorsContext ctx) {

    }

    @Override
    public void exitShow_errors(PLSQLParser.Show_errorsContext ctx) {

    }

    @Override
    public void enterCreate_object(PLSQLParser.Create_objectContext ctx) {

    }

    @Override
    public void exitCreate_object(PLSQLParser.Create_objectContext ctx) {

    }

    @Override
    public void enterProcedure_heading(PLSQLParser.Procedure_headingContext ctx) {

    }

    @Override
    public void exitProcedure_heading(PLSQLParser.Procedure_headingContext ctx) {

    }

    @Override
    public void enterFunction_heading(PLSQLParser.Function_headingContext ctx) {

    }

    @Override
    public void exitFunction_heading(PLSQLParser.Function_headingContext ctx) {

    }

    @Override
    public void enterParameter_declarations(PLSQLParser.Parameter_declarationsContext ctx) {

    }

    @Override
    public void exitParameter_declarations(PLSQLParser.Parameter_declarationsContext ctx) {

    }

    @Override
    public void enterParameter_declaration(PLSQLParser.Parameter_declarationContext ctx) {

    }

    @Override
    public void exitParameter_declaration(PLSQLParser.Parameter_declarationContext ctx) {

    }

    @Override
    public void enterDeclare_section(PLSQLParser.Declare_sectionContext ctx) {

    }

    @Override
    public void exitDeclare_section(PLSQLParser.Declare_sectionContext ctx) {

    }

    @Override
    public void enterCursor_definition(PLSQLParser.Cursor_definitionContext ctx) {

    }

    @Override
    public void exitCursor_definition(PLSQLParser.Cursor_definitionContext ctx) {

    }

    @Override
    public void enterItem_declaration(PLSQLParser.Item_declarationContext ctx) {

    }

    @Override
    public void exitItem_declaration(PLSQLParser.Item_declarationContext ctx) {

    }

    @Override
    public void enterVariable_declaration(PLSQLParser.Variable_declarationContext ctx) {

    }

    @Override
    public void exitVariable_declaration(PLSQLParser.Variable_declarationContext ctx) {

    }

    @Override
    public void enterConstant_declaration(PLSQLParser.Constant_declarationContext ctx) {

    }

    @Override
    public void exitConstant_declaration(PLSQLParser.Constant_declarationContext ctx) {

    }

    @Override
    public void enterException_declaration(PLSQLParser.Exception_declarationContext ctx) {

    }

    @Override
    public void exitException_declaration(PLSQLParser.Exception_declarationContext ctx) {

    }

    @Override
    public void enterType_definition(PLSQLParser.Type_definitionContext ctx) {

    }

    @Override
    public void exitType_definition(PLSQLParser.Type_definitionContext ctx) {

    }

    @Override
    public void enterSubtype_definition(PLSQLParser.Subtype_definitionContext ctx) {

    }

    @Override
    public void exitSubtype_definition(PLSQLParser.Subtype_definitionContext ctx) {

    }

    @Override
    public void enterRecord_type_definition(PLSQLParser.Record_type_definitionContext ctx) {

    }

    @Override
    public void exitRecord_type_definition(PLSQLParser.Record_type_definitionContext ctx) {

    }

    @Override
    public void enterRecord_field_declaration(PLSQLParser.Record_field_declarationContext ctx) {

    }

    @Override
    public void exitRecord_field_declaration(PLSQLParser.Record_field_declarationContext ctx) {

    }

    @Override
    public void enterCollection_type_definition(PLSQLParser.Collection_type_definitionContext ctx) {

    }

    @Override
    public void exitCollection_type_definition(PLSQLParser.Collection_type_definitionContext ctx) {

    }

    @Override
    public void enterVarray_type_definition(PLSQLParser.Varray_type_definitionContext ctx) {

    }

    @Override
    public void exitVarray_type_definition(PLSQLParser.Varray_type_definitionContext ctx) {

    }

    @Override
    public void enterNested_table_type_definition(PLSQLParser.Nested_table_type_definitionContext ctx) {

    }

    @Override
    public void exitNested_table_type_definition(PLSQLParser.Nested_table_type_definitionContext ctx) {

    }

    @Override
    public void enterAssociative_index_type(PLSQLParser.Associative_index_typeContext ctx) {

    }

    @Override
    public void exitAssociative_index_type(PLSQLParser.Associative_index_typeContext ctx) {

    }

    @Override
    public void enterRef_cursor_type_definition(PLSQLParser.Ref_cursor_type_definitionContext ctx) {

    }

    @Override
    public void exitRef_cursor_type_definition(PLSQLParser.Ref_cursor_type_definitionContext ctx) {

    }

    @Override
    public void enterDatatype(PLSQLParser.DatatypeContext ctx) {

    }

    @Override
    public void exitDatatype(PLSQLParser.DatatypeContext ctx) {

    }

    @Override
    public void enterFunction_declaration_or_definition(PLSQLParser.Function_declaration_or_definitionContext ctx) {

    }

    @Override
    public void exitFunction_declaration_or_definition(PLSQLParser.Function_declaration_or_definitionContext ctx) {

    }

    @Override
    public void enterFunction_declaration(PLSQLParser.Function_declarationContext ctx) {

    }

    @Override
    public void exitFunction_declaration(PLSQLParser.Function_declarationContext ctx) {

    }

    @Override
    public void enterFunction_definition(PLSQLParser.Function_definitionContext ctx) {

    }

    @Override
    public void exitFunction_definition(PLSQLParser.Function_definitionContext ctx) {

    }

    @Override
    public void enterProcedure_declaration_or_definition(PLSQLParser.Procedure_declaration_or_definitionContext ctx) {

    }

    @Override
    public void exitProcedure_declaration_or_definition(PLSQLParser.Procedure_declaration_or_definitionContext ctx) {

    }

    @Override
    public void enterProcedure_declaration(PLSQLParser.Procedure_declarationContext ctx) {

    }

    @Override
    public void exitProcedure_declaration(PLSQLParser.Procedure_declarationContext ctx) {

    }

    @Override
    public void enterProcedure_definition(PLSQLParser.Procedure_definitionContext ctx) {

    }

    @Override
    public void exitProcedure_definition(PLSQLParser.Procedure_definitionContext ctx) {

    }

    @Override
    public void enterBody(PLSQLParser.BodyContext ctx) {

    }

    @Override
    public void exitBody(PLSQLParser.BodyContext ctx) {

    }

    @Override
    public void enterException_handler(PLSQLParser.Exception_handlerContext ctx) {

    }

    @Override
    public void exitException_handler(PLSQLParser.Exception_handlerContext ctx) {

    }

    @Override
    public void enterStatement(PLSQLParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(PLSQLParser.StatementContext ctx) {

    }

    @Override
    public void enterLvalue(PLSQLParser.LvalueContext ctx) {

    }

    @Override
    public void exitLvalue(PLSQLParser.LvalueContext ctx) {

    }

    @Override
    public void enterAssign_or_call_statement(PLSQLParser.Assign_or_call_statementContext ctx) {

    }

    @Override
    public void exitAssign_or_call_statement(PLSQLParser.Assign_or_call_statementContext ctx) {

    }

    @Override
    public void enterCall(PLSQLParser.CallContext ctx) {

    }

    @Override
    public void exitCall(PLSQLParser.CallContext ctx) {

    }

    @Override
    public void enterDelete_call(PLSQLParser.Delete_callContext ctx) {

    }

    @Override
    public void exitDelete_call(PLSQLParser.Delete_callContext ctx) {

    }

    @Override
    public void enterBasic_loop_statement(PLSQLParser.Basic_loop_statementContext ctx) {

    }

    @Override
    public void exitBasic_loop_statement(PLSQLParser.Basic_loop_statementContext ctx) {

    }

    @Override
    public void enterCase_statement(PLSQLParser.Case_statementContext ctx) {

    }

    @Override
    public void exitCase_statement(PLSQLParser.Case_statementContext ctx) {

    }

    @Override
    public void enterClose_statement(PLSQLParser.Close_statementContext ctx) {

    }

    @Override
    public void exitClose_statement(PLSQLParser.Close_statementContext ctx) {

    }

    @Override
    public void enterContinue_statement(PLSQLParser.Continue_statementContext ctx) {

    }

    @Override
    public void exitContinue_statement(PLSQLParser.Continue_statementContext ctx) {

    }

    @Override
    public void enterExecute_immediate_statement(PLSQLParser.Execute_immediate_statementContext ctx) {

    }

    @Override
    public void exitExecute_immediate_statement(PLSQLParser.Execute_immediate_statementContext ctx) {

    }

    @Override
    public void enterExit_statement(PLSQLParser.Exit_statementContext ctx) {

    }

    @Override
    public void exitExit_statement(PLSQLParser.Exit_statementContext ctx) {

    }

    @Override
    public void enterFetch_statement(PLSQLParser.Fetch_statementContext ctx) {

    }

    @Override
    public void exitFetch_statement(PLSQLParser.Fetch_statementContext ctx) {

    }

    @Override
    public void enterInto_clause(PLSQLParser.Into_clauseContext ctx) {

    }

    @Override
    public void exitInto_clause(PLSQLParser.Into_clauseContext ctx) {

    }

    @Override
    public void enterBulk_collect_into_clause(PLSQLParser.Bulk_collect_into_clauseContext ctx) {

    }

    @Override
    public void exitBulk_collect_into_clause(PLSQLParser.Bulk_collect_into_clauseContext ctx) {

    }

    @Override
    public void enterUsing_clause(PLSQLParser.Using_clauseContext ctx) {

    }

    @Override
    public void exitUsing_clause(PLSQLParser.Using_clauseContext ctx) {

    }

    @Override
    public void enterParam_modifiers(PLSQLParser.Param_modifiersContext ctx) {

    }

    @Override
    public void exitParam_modifiers(PLSQLParser.Param_modifiersContext ctx) {

    }

    @Override
    public void enterDynamic_returning_clause(PLSQLParser.Dynamic_returning_clauseContext ctx) {

    }

    @Override
    public void exitDynamic_returning_clause(PLSQLParser.Dynamic_returning_clauseContext ctx) {

    }

    @Override
    public void enterFor_loop_statement(PLSQLParser.For_loop_statementContext ctx) {

    }

    @Override
    public void exitFor_loop_statement(PLSQLParser.For_loop_statementContext ctx) {

    }

    @Override
    public void enterForall_statement(PLSQLParser.Forall_statementContext ctx) {

    }

    @Override
    public void exitForall_statement(PLSQLParser.Forall_statementContext ctx) {

    }

    @Override
    public void enterBounds_clause(PLSQLParser.Bounds_clauseContext ctx) {

    }

    @Override
    public void exitBounds_clause(PLSQLParser.Bounds_clauseContext ctx) {

    }

    @Override
    public void enterGoto_statement(PLSQLParser.Goto_statementContext ctx) {

    }

    @Override
    public void exitGoto_statement(PLSQLParser.Goto_statementContext ctx) {

    }

    @Override
    public void enterIf_statement(PLSQLParser.If_statementContext ctx) {

    }

    @Override
    public void exitIf_statement(PLSQLParser.If_statementContext ctx) {

    }

    @Override
    public void enterNull_statement(PLSQLParser.Null_statementContext ctx) {

    }

    @Override
    public void exitNull_statement(PLSQLParser.Null_statementContext ctx) {

    }

    @Override
    public void enterOpen_statement(PLSQLParser.Open_statementContext ctx) {

    }

    @Override
    public void exitOpen_statement(PLSQLParser.Open_statementContext ctx) {

    }

    @Override
    public void enterPragma(PLSQLParser.PragmaContext ctx) {

    }

    @Override
    public void exitPragma(PLSQLParser.PragmaContext ctx) {

    }

    @Override
    public void enterRaise_statement(PLSQLParser.Raise_statementContext ctx) {

    }

    @Override
    public void exitRaise_statement(PLSQLParser.Raise_statementContext ctx) {

    }

    @Override
    public void enterReturn_statement(PLSQLParser.Return_statementContext ctx) {

    }

    @Override
    public void exitReturn_statement(PLSQLParser.Return_statementContext ctx) {

    }

    @Override
    public void enterPlsql_block(PLSQLParser.Plsql_blockContext ctx) {

    }

    @Override
    public void exitPlsql_block(PLSQLParser.Plsql_blockContext ctx) {

    }

    @Override
    public void enterLabel(PLSQLParser.LabelContext ctx) {

    }

    @Override
    public void exitLabel(PLSQLParser.LabelContext ctx) {

    }

    @Override
    public void enterQual_id(PLSQLParser.Qual_idContext ctx) {

    }

    @Override
    public void exitQual_id(PLSQLParser.Qual_idContext ctx) {

    }

    @Override
    public void enterSql_statement(PLSQLParser.Sql_statementContext ctx) {

    }

    @Override
    public void exitSql_statement(PLSQLParser.Sql_statementContext ctx) {

    }

    @Override
    public void enterCommit_statement(PLSQLParser.Commit_statementContext ctx) {

    }

    @Override
    public void exitCommit_statement(PLSQLParser.Commit_statementContext ctx) {

    }

    @Override
    public void enterDelete_statement(PLSQLParser.Delete_statementContext ctx) {

    }

    @Override
    public void exitDelete_statement(PLSQLParser.Delete_statementContext ctx) {

    }

    @Override
    public void enterInsert_statement(PLSQLParser.Insert_statementContext ctx) {

    }

    @Override
    public void exitInsert_statement(PLSQLParser.Insert_statementContext ctx) {

    }

    @Override
    public void enterLock_table_statement(PLSQLParser.Lock_table_statementContext ctx) {

    }

    @Override
    public void exitLock_table_statement(PLSQLParser.Lock_table_statementContext ctx) {

    }

    @Override
    public void enterRollback_statement(PLSQLParser.Rollback_statementContext ctx) {

    }

    @Override
    public void exitRollback_statement(PLSQLParser.Rollback_statementContext ctx) {

    }

    @Override
    public void enterSavepoint_statement(PLSQLParser.Savepoint_statementContext ctx) {

    }

    @Override
    public void exitSavepoint_statement(PLSQLParser.Savepoint_statementContext ctx) {

    }

    @Override
    public void enterSelect_statement(PLSQLParser.Select_statementContext ctx) {

    }

    @Override
    public void exitSelect_statement(PLSQLParser.Select_statementContext ctx) {

    }

    @Override
    public void enterSet_transaction_statement(PLSQLParser.Set_transaction_statementContext ctx) {

    }

    @Override
    public void exitSet_transaction_statement(PLSQLParser.Set_transaction_statementContext ctx) {

    }

    @Override
    public void enterUpdate_statement(PLSQLParser.Update_statementContext ctx) {

    }

    @Override
    public void exitUpdate_statement(PLSQLParser.Update_statementContext ctx) {

    }

    @Override
    public void enterSwallow_to_semi(PLSQLParser.Swallow_to_semiContext ctx) {

    }

    @Override
    public void exitSwallow_to_semi(PLSQLParser.Swallow_to_semiContext ctx) {

    }

    @Override
    public void enterWhile_loop_statement(PLSQLParser.While_loop_statementContext ctx) {

    }

    @Override
    public void exitWhile_loop_statement(PLSQLParser.While_loop_statementContext ctx) {

    }

    @Override
    public void enterMatch_parens(PLSQLParser.Match_parensContext ctx) {

    }

    @Override
    public void exitMatch_parens(PLSQLParser.Match_parensContext ctx) {

    }

    @Override
    public void enterLabel_name(PLSQLParser.Label_nameContext ctx) {

    }

    @Override
    public void exitLabel_name(PLSQLParser.Label_nameContext ctx) {

    }

    @Override
    public void enterExpression(PLSQLParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(PLSQLParser.ExpressionContext ctx) {

    }

    @Override
    public void enterOr_expr(PLSQLParser.Or_exprContext ctx) {

    }

    @Override
    public void exitOr_expr(PLSQLParser.Or_exprContext ctx) {

    }

    @Override
    public void enterAnd_expr(PLSQLParser.And_exprContext ctx) {

    }

    @Override
    public void exitAnd_expr(PLSQLParser.And_exprContext ctx) {

    }

    @Override
    public void enterNot_expr(PLSQLParser.Not_exprContext ctx) {

    }

    @Override
    public void exitNot_expr(PLSQLParser.Not_exprContext ctx) {

    }

    @Override
    public void enterCompare_expr(PLSQLParser.Compare_exprContext ctx) {

    }

    @Override
    public void exitCompare_expr(PLSQLParser.Compare_exprContext ctx) {

    }

    @Override
    public void enterIs_null_expr(PLSQLParser.Is_null_exprContext ctx) {

    }

    @Override
    public void exitIs_null_expr(PLSQLParser.Is_null_exprContext ctx) {

    }

    @Override
    public void enterLike_expr(PLSQLParser.Like_exprContext ctx) {

    }

    @Override
    public void exitLike_expr(PLSQLParser.Like_exprContext ctx) {

    }

    @Override
    public void enterBetween_expr(PLSQLParser.Between_exprContext ctx) {

    }

    @Override
    public void exitBetween_expr(PLSQLParser.Between_exprContext ctx) {

    }

    @Override
    public void enterIn_expr(PLSQLParser.In_exprContext ctx) {

    }

    @Override
    public void exitIn_expr(PLSQLParser.In_exprContext ctx) {

    }

    @Override
    public void enterNumeric_expression(PLSQLParser.Numeric_expressionContext ctx) {

    }

    @Override
    public void exitNumeric_expression(PLSQLParser.Numeric_expressionContext ctx) {

    }

    @Override
    public void enterAdd_expr(PLSQLParser.Add_exprContext ctx) {

    }

    @Override
    public void exitAdd_expr(PLSQLParser.Add_exprContext ctx) {

    }

    @Override
    public void enterMul_expr(PLSQLParser.Mul_exprContext ctx) {

    }

    @Override
    public void exitMul_expr(PLSQLParser.Mul_exprContext ctx) {

    }

    @Override
    public void enterUnary_sign_expr(PLSQLParser.Unary_sign_exprContext ctx) {

    }

    @Override
    public void exitUnary_sign_expr(PLSQLParser.Unary_sign_exprContext ctx) {

    }

    @Override
    public void enterExponent_expr(PLSQLParser.Exponent_exprContext ctx) {

    }

    @Override
    public void exitExponent_expr(PLSQLParser.Exponent_exprContext ctx) {

    }

    @Override
    public void enterAtom(PLSQLParser.AtomContext ctx) {

    }

    @Override
    public void exitAtom(PLSQLParser.AtomContext ctx) {

    }

    @Override
    public void enterVariable_or_function_call(PLSQLParser.Variable_or_function_callContext ctx) {

    }

    @Override
    public void exitVariable_or_function_call(PLSQLParser.Variable_or_function_callContext ctx) {

    }

    @Override
    public void enterAttribute(PLSQLParser.AttributeContext ctx) {

    }

    @Override
    public void exitAttribute(PLSQLParser.AttributeContext ctx) {

    }

    @Override
    public void enterCall_args(PLSQLParser.Call_argsContext ctx) {

    }

    @Override
    public void exitCall_args(PLSQLParser.Call_argsContext ctx) {

    }

    @Override
    public void enterBoolean_atom(PLSQLParser.Boolean_atomContext ctx) {

    }

    @Override
    public void exitBoolean_atom(PLSQLParser.Boolean_atomContext ctx) {

    }

    @Override
    public void enterNumeric_atom(PLSQLParser.Numeric_atomContext ctx) {

    }

    @Override
    public void exitNumeric_atom(PLSQLParser.Numeric_atomContext ctx) {

    }

    @Override
    public void enterNumeric_literal(PLSQLParser.Numeric_literalContext ctx) {

    }

    @Override
    public void exitNumeric_literal(PLSQLParser.Numeric_literalContext ctx) {

    }

    @Override
    public void enterBoolean_literal(PLSQLParser.Boolean_literalContext ctx) {

    }

    @Override
    public void exitBoolean_literal(PLSQLParser.Boolean_literalContext ctx) {

    }

    @Override
    public void enterString_literal(PLSQLParser.String_literalContext ctx) {

    }

    @Override
    public void exitString_literal(PLSQLParser.String_literalContext ctx) {

    }

    @Override
    public void enterCollection_exists(PLSQLParser.Collection_existsContext ctx) {

    }

    @Override
    public void exitCollection_exists(PLSQLParser.Collection_existsContext ctx) {

    }

    @Override
    public void enterConditional_predicate(PLSQLParser.Conditional_predicateContext ctx) {

    }

    @Override
    public void exitConditional_predicate(PLSQLParser.Conditional_predicateContext ctx) {

    }

    @Override
    public void enterParameter(PLSQLParser.ParameterContext ctx) {

    }

    @Override
    public void exitParameter(PLSQLParser.ParameterContext ctx) {

    }

    @Override
    public void enterIndex(PLSQLParser.IndexContext ctx) {

    }

    @Override
    public void exitIndex(PLSQLParser.IndexContext ctx) {

    }

    @Override
    public void enterCreate_package(PLSQLParser.Create_packageContext ctx) {

    }

    @Override
    public void exitCreate_package(PLSQLParser.Create_packageContext ctx) {

    }

    @Override
    public void enterCreate_package_body(PLSQLParser.Create_package_bodyContext ctx) {

    }

    @Override
    public void exitCreate_package_body(PLSQLParser.Create_package_bodyContext ctx) {

    }

    @Override
    public void enterCreate_procedure(PLSQLParser.Create_procedureContext ctx) {

    }

    @Override
    public void exitCreate_procedure(PLSQLParser.Create_procedureContext ctx) {

    }

    @Override
    public void enterCreate_function(PLSQLParser.Create_functionContext ctx) {

    }

    @Override
    public void exitCreate_function(PLSQLParser.Create_functionContext ctx) {

    }

    @Override
    public void enterInvoker_rights_clause(PLSQLParser.Invoker_rights_clauseContext ctx) {

    }

    @Override
    public void exitInvoker_rights_clause(PLSQLParser.Invoker_rights_clauseContext ctx) {

    }

    @Override
    public void enterCall_spec(PLSQLParser.Call_specContext ctx) {

    }

    @Override
    public void exitCall_spec(PLSQLParser.Call_specContext ctx) {

    }

    @Override
    public void enterKERRORS(PLSQLParser.KERRORSContext ctx) {

    }

    @Override
    public void exitKERRORS(PLSQLParser.KERRORSContext ctx) {

    }

    @Override
    public void enterKEXCEPTIONS(PLSQLParser.KEXCEPTIONSContext ctx) {

    }

    @Override
    public void exitKEXCEPTIONS(PLSQLParser.KEXCEPTIONSContext ctx) {

    }

    @Override
    public void enterKFOUND(PLSQLParser.KFOUNDContext ctx) {

    }

    @Override
    public void exitKFOUND(PLSQLParser.KFOUNDContext ctx) {

    }

    @Override
    public void enterKINDICES(PLSQLParser.KINDICESContext ctx) {

    }

    @Override
    public void exitKINDICES(PLSQLParser.KINDICESContext ctx) {

    }

    @Override
    public void enterKMOD(PLSQLParser.KMODContext ctx) {

    }

    @Override
    public void exitKMOD(PLSQLParser.KMODContext ctx) {

    }

    @Override
    public void enterKNAME(PLSQLParser.KNAMEContext ctx) {

    }

    @Override
    public void exitKNAME(PLSQLParser.KNAMEContext ctx) {

    }

    @Override
    public void enterKOF(PLSQLParser.KOFContext ctx) {

    }

    @Override
    public void exitKOF(PLSQLParser.KOFContext ctx) {

    }

    @Override
    public void enterKREPLACE(PLSQLParser.KREPLACEContext ctx) {

    }

    @Override
    public void exitKREPLACE(PLSQLParser.KREPLACEContext ctx) {

    }

    @Override
    public void enterKROWCOUNT(PLSQLParser.KROWCOUNTContext ctx) {

    }

    @Override
    public void exitKROWCOUNT(PLSQLParser.KROWCOUNTContext ctx) {

    }

    @Override
    public void enterKSAVE(PLSQLParser.KSAVEContext ctx) {

    }

    @Override
    public void exitKSAVE(PLSQLParser.KSAVEContext ctx) {

    }

    @Override
    public void enterKSHOW(PLSQLParser.KSHOWContext ctx) {

    }

    @Override
    public void exitKSHOW(PLSQLParser.KSHOWContext ctx) {

    }

    @Override
    public void enterKTYPE(PLSQLParser.KTYPEContext ctx) {

    }

    @Override
    public void exitKTYPE(PLSQLParser.KTYPEContext ctx) {

    }

    @Override
    public void enterKVALUES(PLSQLParser.KVALUESContext ctx) {

    }

    @Override
    public void exitKVALUES(PLSQLParser.KVALUESContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode node) {

    }

    @Override
    public void visitErrorNode(ErrorNode node) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    //error listener
    private static class CompilerErrorListener implements ANTLRErrorListener{
        private List<String> errors;
        public CompilerErrorListener(List<String> errors){
            this.errors=errors;
        }
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            errors.add(msg);
        }

        @Override
        public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {

        }

        @Override
        public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {

        }

        @Override
        public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {

        }
    }


}
