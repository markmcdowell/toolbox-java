// automatically generated by the FlatBuffers compiler, do not modify

package com.reactivemarkets.encoding.fbs;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class MarketData extends Table {
    public static MarketData getRootAsMarketData(ByteBuffer _bb) {
        return getRootAsMarketData(_bb, new MarketData());
    }

    public static MarketData getRootAsMarketData(ByteBuffer _bb, MarketData obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
    }

    public static void startMarketData(FlatBufferBuilder builder) {
        builder.startObject(10);
    }

    public static void addAccnt(FlatBufferBuilder builder, int accntOffset) {
        builder.addOffset(0, accntOffset, 0);
    }

    public static void addMarket(FlatBufferBuilder builder, int marketOffset) {
        builder.addOffset(1, marketOffset, 0);
    }

    public static void addFlags(FlatBufferBuilder builder, int flags) {
        builder.addShort(2, (short) flags, (short) 0);
    }

    public static void addId(FlatBufferBuilder builder, int idOffset) {
        builder.addOffset(3, idOffset, 0);
    }

    public static void addRequestId(FlatBufferBuilder builder, int requestIdOffset) {
        builder.addOffset(4, requestIdOffset, 0);
    }

    public static void addLastTrade(FlatBufferBuilder builder, int lastTradeOffset) {
        builder.addStruct(5, lastTradeOffset, 0);
    }

    public static void addBidL2(FlatBufferBuilder builder, int bidL2Offset) {
        builder.addOffset(6, bidL2Offset, 0);
    }

    public static void startBidL2Vector(FlatBufferBuilder builder, int numElems) {
        builder.startVector(32, numElems, 8);
    }

    public static void addOfferL2(FlatBufferBuilder builder, int offerL2Offset) {
        builder.addOffset(7, offerL2Offset, 0);
    }

    public static void startOfferL2Vector(FlatBufferBuilder builder, int numElems) {
        builder.startVector(32, numElems, 8);
    }

    public static void addBidL3(FlatBufferBuilder builder, int bidL3Offset) {
        builder.addOffset(8, bidL3Offset, 0);
    }

    public static void startBidL3Vector(FlatBufferBuilder builder, int numElems) {
        builder.startVector(24, numElems, 8);
    }

    public static void addOfferL3(FlatBufferBuilder builder, int offerL3Offset) {
        builder.addOffset(9, offerL3Offset, 0);
    }

    public static void startOfferL3Vector(FlatBufferBuilder builder, int numElems) {
        builder.startVector(24, numElems, 8);
    }

    public static int endMarketData(FlatBufferBuilder builder) {
        int o = builder.endObject();
        builder.required(o, 6);  // market
        return o;
    }

    public void __init(int _i, ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
        vtable_start = bb_pos - bb.getInt(bb_pos);
        vtable_size = bb.getShort(vtable_start);
    }

    public MarketData __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public String accnt() {
        int o = __offset(4);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer accntAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer accntInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 4, 1);
    }

    public String market() {
        int o = __offset(6);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer marketAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer marketInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 6, 1);
    }

    public int flags() {
        int o = __offset(8);
        return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0;
    }

    public String id() {
        int o = __offset(10);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer idAsByteBuffer() {
        return __vector_as_bytebuffer(10, 1);
    }

    public ByteBuffer idInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 10, 1);
    }

    public String requestId() {
        int o = __offset(12);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer requestIdAsByteBuffer() {
        return __vector_as_bytebuffer(12, 1);
    }

    public ByteBuffer requestIdInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 12, 1);
    }

    public MDTrade lastTrade() {
        return lastTrade(new MDTrade());
    }

    public MDTrade lastTrade(MDTrade obj) {
        int o = __offset(14);
        return o != 0 ? obj.__assign(o + bb_pos, bb) : null;
    }

    public MDLevel bidL2(int j) {
        return bidL2(new MDLevel(), j);
    }

    public MDLevel bidL2(MDLevel obj, int j) {
        int o = __offset(16);
        return o != 0 ? obj.__assign(__vector(o) + j * 32, bb) : null;
    }

    public int bidL2Length() {
        int o = __offset(16);
        return o != 0 ? __vector_len(o) : 0;
    }

    public MDLevel offerL2(int j) {
        return offerL2(new MDLevel(), j);
    }

    public MDLevel offerL2(MDLevel obj, int j) {
        int o = __offset(18);
        return o != 0 ? obj.__assign(__vector(o) + j * 32, bb) : null;
    }

    public int offerL2Length() {
        int o = __offset(18);
        return o != 0 ? __vector_len(o) : 0;
    }

    public MDEntry bidL3(int j) {
        return bidL3(new MDEntry(), j);
    }

    public MDEntry bidL3(MDEntry obj, int j) {
        int o = __offset(20);
        return o != 0 ? obj.__assign(__vector(o) + j * 24, bb) : null;
    }

    public int bidL3Length() {
        int o = __offset(20);
        return o != 0 ? __vector_len(o) : 0;
    }

    public MDEntry offerL3(int j) {
        return offerL3(new MDEntry(), j);
    }

    public MDEntry offerL3(MDEntry obj, int j) {
        int o = __offset(22);
        return o != 0 ? obj.__assign(__vector(o) + j * 24, bb) : null;
    }

    public int offerL3Length() {
        int o = __offset(22);
        return o != 0 ? __vector_len(o) : 0;
    }
}
