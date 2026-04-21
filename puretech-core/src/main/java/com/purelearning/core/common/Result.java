package com.purelearning.core.common;

import lombok.Data;

/**
 * 统一返回结果封装
 *
 * @author PureLearning
 * @date 2026/4/21
 */
@Data
public class Result<T> {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    // ==================== 成功 ====================

    /**
     * 成功，带数据
     * {"code": 200, "message": "success", "data": {...}}
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMessage("success");
        result.setData(data);
        return result;
    }

    /**
     * 成功，不带数据
     * {"code": 200, "message": "success", "data": null}
     */
    public static <T> Result<T> success() {
        return success(null);
    }

    /**
     * 成功，自定义信息
     * {"code": 200, "message": "创建成功", "data": {...}}
     */
    public static <T> Result<T> success(String message, T data) {
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    // ==================== 失败 ====================

    /**
     * 失败，自定义状态码和信息
     * {"code": 404, "message": "用户不存在", "data": null}
     */
    public static <T> Result<T> fail(Integer code, String message) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMessage(message);
        result.setData(null);
        return result;
    }

    /**
     * 失败，默认500
     * {"code": 500, "message": "服务器内部错误", "data": null}
     */
    public static <T> Result<T> fail(String message) {
        return fail(500, message);
    }

    /**
     * 参数错误，400
     * {"code": 400, "message": "请求参数错误", "data": null}
     */
    public static <T> Result<T> badRequest(String message) {
        return fail(400, message);
    }

    /**
     * 未登录，401
     * {"code": 401, "message": "未登录", "data": null}
     */
    public static <T> Result<T> unauthorized() {
        return fail(401, "未登录");
    }

    /**
     * 无权限，403
     * {"code": 403, "message": "无权限", "data": null}
     */
    public static <T> Result<T> forbidden() {
        return fail(403, "无权限");
    }

    /**
     * 资源不存在，404
     * {"code": 404, "message": "资源不存在", "data": null}
     */
    public static <T> Result<T> notFound(String message) {
        return fail(404, message);
    }
}