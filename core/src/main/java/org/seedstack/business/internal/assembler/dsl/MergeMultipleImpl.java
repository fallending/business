/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.business.internal.assembler.dsl;

import org.javatuples.Decade;
import org.javatuples.Ennead;
import org.javatuples.Octet;
import org.javatuples.Pair;
import org.javatuples.Quartet;
import org.javatuples.Quintet;
import org.javatuples.Septet;
import org.javatuples.Sextet;
import org.javatuples.Triplet;
import org.seedstack.business.assembler.dsl.MergeAs;
import org.seedstack.business.assembler.dsl.MergeFromRepository;
import org.seedstack.business.assembler.dsl.MergeMultiple;
import org.seedstack.business.assembler.dsl.MergeMultipleWithQualifier;
import org.seedstack.business.domain.AggregateRoot;

import java.lang.annotation.Annotation;
import java.util.stream.Stream;


class MergeMultipleImpl<D> implements MergeMultipleWithQualifier {
    private final Context context;
    private final Stream<D> dtoStream;

    MergeMultipleImpl(Context context, Stream<D> dtoStream) {
        this.context = context;
        this.dtoStream = dtoStream;
    }

    @Override
    public <A extends AggregateRoot<ID>, ID> MergeFromRepository<MergeAs<A>> into(Class<A> aggregateRootClass) {
        return new MergeMultipleAggregatesFromRepositoryImpl<>(context, dtoStream, aggregateRootClass);
    }

    @Override
    public <A1 extends AggregateRoot<?>, A2 extends AggregateRoot<?>>
    MergeFromRepository<MergeAs<Pair<A1, A2>>> into(Class<A1> first, Class<A2> second) {
        return new MergeMultipleTuplesFromRepositoryImpl<>(context, dtoStream, first, second);
    }

    @Override
    public <A1 extends AggregateRoot<?>, A2 extends AggregateRoot<?>, A3 extends AggregateRoot<?>>
    MergeFromRepository<MergeAs<Triplet<A1, A2, A3>>> into(Class<A1> first, Class<A2> second, Class<A3> third) {
        return new MergeMultipleTuplesFromRepositoryImpl<>(context, dtoStream, first, second, third);
    }

    @Override
    public <A1 extends AggregateRoot<?>, A2 extends AggregateRoot<?>, A3 extends AggregateRoot<?>, A4 extends AggregateRoot<?>>
    MergeFromRepository<MergeAs<Quartet<A1, A2, A3, A4>>> into(Class<A1> first, Class<A2> second, Class<A3> third, Class<A4> fourth) {
        return new MergeMultipleTuplesFromRepositoryImpl<>(context, dtoStream, first, second, third, fourth);
    }

    @Override
    public <A1 extends AggregateRoot<?>, A2 extends AggregateRoot<?>, A3 extends AggregateRoot<?>, A4 extends AggregateRoot<?>, A5 extends AggregateRoot<?>>
    MergeFromRepository<MergeAs<Quintet<A1, A2, A3, A4, A5>>> into(Class<A1> first, Class<A2> second, Class<A3> third, Class<A4> fourth, Class<A5> fifth) {
        return new MergeMultipleTuplesFromRepositoryImpl<>(context, dtoStream, first, second, third, fourth, fifth);
    }

    @Override
    public <A1 extends AggregateRoot<?>, A2 extends AggregateRoot<?>, A3 extends AggregateRoot<?>, A4 extends AggregateRoot<?>, A5 extends AggregateRoot<?>, A6 extends AggregateRoot<?>>
    MergeFromRepository<MergeAs<Sextet<A1, A2, A3, A4, A5, A6>>> into(Class<A1> first, Class<A2> second, Class<A3> third, Class<A4> fourth, Class<A5> fifth, Class<A6> sixth) {
        return new MergeMultipleTuplesFromRepositoryImpl<>(context, dtoStream, first, second, third, fourth, fifth, sixth);
    }

    @Override
    public <A1 extends AggregateRoot<?>, A2 extends AggregateRoot<?>, A3 extends AggregateRoot<?>, A4 extends AggregateRoot<?>, A5 extends AggregateRoot<?>, A6 extends AggregateRoot<?>, A7 extends AggregateRoot<?>>
    MergeFromRepository<MergeAs<Septet<A1, A2, A3, A4, A5, A6, A7>>> into(Class<A1> first, Class<A2> second, Class<A3> third, Class<A4> fourth, Class<A5> fifth, Class<A6> sixth, Class<A7> seventh) {
        return new MergeMultipleTuplesFromRepositoryImpl<>(context, dtoStream, first, second, third, fourth, fifth, sixth, seventh);
    }

    @Override
    public <A1 extends AggregateRoot<?>, A2 extends AggregateRoot<?>, A3 extends AggregateRoot<?>, A4 extends AggregateRoot<?>, A5 extends AggregateRoot<?>, A6 extends AggregateRoot<?>, A7 extends AggregateRoot<?>, A8 extends AggregateRoot<?>>
    MergeFromRepository<MergeAs<Octet<A1, A2, A3, A4, A5, A6, A7, A8>>> into(Class<A1> first, Class<A2> second, Class<A3> third, Class<A4> fourth, Class<A5> fifth, Class<A6> sixth, Class<A7> seventh, Class<A8> eighth) {
        return new MergeMultipleTuplesFromRepositoryImpl<>(context, dtoStream, first, second, third, fourth, fifth, sixth, seventh, eighth);
    }

    @Override
    public <A1 extends AggregateRoot<?>, A2 extends AggregateRoot<?>, A3 extends AggregateRoot<?>, A4 extends AggregateRoot<?>, A5 extends AggregateRoot<?>, A6 extends AggregateRoot<?>, A7 extends AggregateRoot<?>, A8 extends AggregateRoot<?>, A9 extends AggregateRoot<?>>
    MergeFromRepository<MergeAs<Ennead<A1, A2, A3, A4, A5, A6, A7, A8, A9>>> into(Class<A1> first, Class<A2> second, Class<A3> third, Class<A4> fourth, Class<A5> fifth, Class<A6> sixth, Class<A7> seventh, Class<A8> eighth, Class<A9> ninth) {
        return new MergeMultipleTuplesFromRepositoryImpl<>(context, dtoStream, first, second, third, fourth, fifth, sixth, seventh, eighth, ninth);
    }

    @Override
    public <A1 extends AggregateRoot<?>, A2 extends AggregateRoot<?>, A3 extends AggregateRoot<?>, A4 extends AggregateRoot<?>, A5 extends AggregateRoot<?>, A6 extends AggregateRoot<?>, A7 extends AggregateRoot<?>, A8 extends AggregateRoot<?>, A9 extends AggregateRoot<?>, A10 extends AggregateRoot<?>>
    MergeFromRepository<MergeAs<Decade<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10>>> into(Class<A1> first, Class<A2> second, Class<A3> third, Class<A4> fourth, Class<A5> fifth, Class<A6> sixth, Class<A7> seventh, Class<A8> eighth, Class<A9> ninth, Class<A10> tenth) {
        return new MergeMultipleTuplesFromRepositoryImpl<>(context, dtoStream, first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth);
    }

    @Override
    public MergeMultiple with(Annotation qualifier) {
        getContext().setAssemblerQualifier(qualifier);
        return this;
    }

    @Override
    public MergeMultiple with(Class<? extends Annotation> qualifier) {
        getContext().setAssemblerQualifierClass(qualifier);
        return this;
    }

    Context getContext() {
        return context;
    }
}
