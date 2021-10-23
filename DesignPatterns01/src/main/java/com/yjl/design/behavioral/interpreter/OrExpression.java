package com.yjl.design.behavioral.interpreter;

/**
 * @program: DesignPatterns
 * @author: yjl
 * @created: 2021/10/23
 * 非终结表达式
 */
public class OrExpression  extends  IDCardExpression{
    /**
     * 组合两个终结表达式，最终的判断结果是终结表示判断出来，
     */
    private IDCardExpression cityExp;
    private IDCardExpression typeExp;

    public OrExpression(IDCardExpression cityExp, IDCardExpression typeExp) {
        this.cityExp = cityExp;
        this.typeExp = typeExp;
    }

    @Override
    boolean interpret(String expression) {

        return cityExp.interpret(expression) || typeExp.interpret(expression);
    }
}
